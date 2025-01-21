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
      cout << "Nome: " << nome << "\n";
      cout << "Idade: " << idade << "\n";
      cout << "Nota 1: " << nota1 << "\n";
      cout << "Nota 2: " << nota2 << "\n";
  }
  
  void calcularMedia(float stNota1, float stNota2){
      float soma = 0, media = 0;
      soma = stNota1 + stNota2;
      media = soma / 2;
      cout << "Média: " << media << "\n\n";
  }
};

int main() {
    Aluno *alunos = new Aluno[5];
    Aluno a1,a2,a3,a4,a5;
    alunos[0] = a1;
    alunos[1] = a2;
    alunos[2] = a3;
    alunos[3] = a4;
    alunos[4] = a5;
    
    alunos[0].inserirDados("Aluno1", 20, 9.0, 7.5);
    alunos[1].inserirDados("Aluno2", 21, 8.0, 8.5);
    alunos[2].inserirDados("Aluno3", 22, 7.0, 9.5);
    alunos[3].inserirDados("Aluno4", 23, 8.0, 8.5);
    alunos[4].inserirDados("Aluno5", 24, 7.0, 9.5);
    
    for(int i = 0; i < 5; i++){
        alunos[i].imprimirDados();
        alunos[i].calcularMedia(alunos[i].nota1, alunos[i].nota2);
    }
    return 0;
}