const express = require('express');
const rota = express.Router();
const Livro = require('../models/Livro');

rota.get('/teste', (req, res) => {
    res.send('Conexão estabelecida');
});

rota.get('view:id', (req, res) => Livro.findOne({
    where: { id: req.params.id }
}).then(livro => {
    res.render('view', {
        livro
    });
}).catch(err => console.log(err)));


rota.get('/add', (req, res) => {
    res.render('add');
});

rota.post('/add', (req, res) => {
    let { titulo, autor, anoPublicacao, new_livro } = req.body;
    Livro.create({
        titulo,
        autor,
        anoPublicacao,
        new_livro
    })
        .then(() => res.redirect('/'))
        .catch(err => console.log(err));
});

module.exports = rota