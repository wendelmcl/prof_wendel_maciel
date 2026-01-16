const prompt = require('prompt-sync')();
var vetor = []
var valores = 0;
for(var i = 0; i < 5; i++){
    valores = prompt("Digite um valor: ");
    vetor[i] = valores;
}

for(var i = 0; i < 5; i++){
    console.log("Vetor: " + vetor[i]);
}
