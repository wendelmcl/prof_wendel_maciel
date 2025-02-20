#include<iostream>
using namespace std;
int pesquisaLinear(int vetor[], int tamanho, int valor, int &passos){
    for(int i = 0; i < tamanho; i++){
        passos++;
        if(valor == vetor[i]){
            return i;
        }else if(vetor[i] > valor){
            return -1;
        }
    }
    return -1;
}

int main(){
    int vetor[] = {2, 5, 8, 12, 16, 23, 38, 45, 56, 72};
    int tamanho = 10;
    int passos = 0;
    int valor = 0;
    cout << "Digite um valor: ";
    cin >> valor;
    int resultado = pesquisaLinear(vetor, tamanho, valor, passos);
    if(resultado != -1){
        cout << "Elemento encontrado ma posição: " << resultado << endl;
    } else {
        cout << "Elemento não encontrado" << endl;
    }
    cout << "Número de passos necessários: " << passos << endl;

}