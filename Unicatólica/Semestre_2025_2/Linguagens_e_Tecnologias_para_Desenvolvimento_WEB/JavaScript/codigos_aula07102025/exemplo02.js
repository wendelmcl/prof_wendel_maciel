var nome = ["Francisco", "Wendel", "de", "Lima", "Maciel"]
console.log("Elementos: " + nome.length);
console.log(nome[0]);
console.log(nome[nome.length-1]);
nome.push("Primeiro");
for(var i = 0; i < nome.length; i++){
    console.log("Vetor: " + nome[i]);
}
