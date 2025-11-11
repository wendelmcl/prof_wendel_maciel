const Sequelize = require('sequelize');
const database = require('../banco_de_dados/connection');

const Livro = database.define('livros',{
    titulo: {
        type: Sequelize.STRING,
    },
    autor: {
        type: Sequelize.STRING,
    },
    anoPublicacao: {
        type: Sequelize.STRING,
    },
    new_livro:{
        type: Sequelize.INTEGER,
    }
});

module.exports = Livro