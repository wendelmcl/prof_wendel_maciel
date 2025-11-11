const express = require('express');
const { engine } = require('express-handlebars');
const app = express();
const bd = require('./banco_de_dados/connection');
const bodyParser = require('body-parser');
const path = require('path');
const Livro = require('./models/Livro');
const Sequelize = require('sequelize');
const Op = Sequelize.Op;

const PORT = 3000;

app.listen(PORT, function () {
    console.log(`O Express está rodando na porta: ${PORT}`);
});

app.use(bodyParser.urlencoded({ extended: false }));

app.set('views', path.join(__dirname, './views/'));
app.engine('handlebars', engine({ defaultLayout: 'main' }));
app.set('view engine', 'handlebars');

app.use(express.static(path.join(__dirname, './estaticos/')));


bd
    .authenticate()
    .then(() => {
        console.log("Conectado ao banco");
    })
    .catch(err => {
        console.log("Ocorreu um erro", err);
    });

app.get('/', (req, res) => {

    let search = req.query.livro;
    let query = '%' + search + '%';

    if (!search) {
        Livro.findAll({
            order: [['createdAt', 'DESC']
            ]
        })
            .then(livros => {
                res.render('app', {
                    livros
                });
            })
            .catch(err => console.log(err));
    } else {
        Livro.findAll({
            where: { titulo: { [Op.like]: query }},
            order: [['createdAt', 'DESC']
            ]
        })
            .then(livros => {
                res.render('app', {
                    livros, search
                });
            })
            .catch(err => console.log(err));
    }
});


app.get('/livros/add', (req, res) => {
    res.render('add');
});

app.get('/livros/view/:id', (req, res) => {
    
    const id = req.params.id;

    Livro.findOne({
        where: { id: id }
    })
    .then(livro => {
        if (!livro) {
            res.status(404).send('Livro não encontrado');
            return;
        }

        res.render('views', {
            livro: livro 
        });
    })
    .catch(err => console.log(err));

});


app.use('/livro_rotas', require('./rotas/livro_rotas'));