#include <iostream>
using namespace std;
struct Aluno{
    string nome;
    int idade;
    float nota1;
    float nota2;

    void inserirDados(string stNome, int stIdade, float stNota1, float stNota2){
        nome = stNome;
        idade = stIdade;
        nota1 = stNota1;
        nota2 = stNota2;
    }

    void imprimirDados(){
        cout << "Nome: " << nome << endl;
        cout << "Idade: " << idade << endl;
        cout << "Nota1: " << nota1 << endl;
        cout << "Nota2: " << nota2 << endl;
    }
    void calcularMedia(){
        float soma = 0, media = 0;
        soma = nota1 + nota2;
        media = soma / 2;
        cout << "Media: " << media << endl;
    }
};
int main(){
    Aluno *alunos = new Aluno[2];
    Aluno a1, a2;
    alunos[0] = a1;
    alunos[1] = a2;
    alunos[0].inserirDados("Aluno1", 20, 9.0, 7.5);
    alunos[1].inserirDados("Aluno2", 30, 9.0, 9.5);
    for(int i = 0; i < 2; i++){
        alunos[i].imprimirDados();
        alunos[i].calcularMedia();
        cout << endl;
    }
    return 0;
}