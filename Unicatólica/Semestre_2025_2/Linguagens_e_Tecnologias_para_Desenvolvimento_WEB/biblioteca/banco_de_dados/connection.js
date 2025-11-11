const Sequelize = require('sequelize');
const sequelize = new Sequelize({
    dialect: 'sqlite',
    storage: './banco_de_dados/banco.db'
});
module.exports = sequelize