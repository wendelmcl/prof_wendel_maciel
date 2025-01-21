#include <iostream>
using namespace std;

int busca_simples(int vetor[5], int valor){
    int contador = 0;
    bool resultado = false;
      for(int i = 0; i < 5; i++){
        if(valor == vetor[i]){
            resultado = true;
            contador = i;
        }
    }
    if(resultado == false){
        contador = -1;
    }
    return contador;
}

int main(){
    int vetor[5] = {10,2,7,9,4};
    int valor = 0, posicao = 0;
    cout << "Digite um valor: ";
    cin >> valor;
    posicao = busca_simples(vetor, valor);
    if(posicao != -1){
        cout << "Posicao["<<posicao<<"]" << endl;
    }else{
        cout << "Elemento nao encontrado";
    }
    return 0;
}