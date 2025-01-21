#include <iostream>void
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
      cout << "Nota1: " << nota1 << "\n";
      cout << "Nota2: " << nota2 << "\n";
    }
  
  void calcularMedia(float stNota1, float stNota2){
      float soma = 0, media = 0;
      soma = stNota1 + stNota2;
      media = soma / 2;
      cout << "Média: " << media << "\n\n";
  }
  
};

int main() {
    Aluno a1;
    a1.inserirDados("Aluno1", 20, 8.0, 9.0);
    a1.imprimirDados();
    a1.calcularMedia(8.0,9.0);

    return 0;
}