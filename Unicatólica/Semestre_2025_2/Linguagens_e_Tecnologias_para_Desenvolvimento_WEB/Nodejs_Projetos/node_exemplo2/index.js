let {writeFile} = require('fs');
writeFile("arquivo.txt", "Boa noite!!!", (error) => {
    if(error){
        throw error;
    }else{
        console.log("Escrito com sucesso!!!");
    }
});