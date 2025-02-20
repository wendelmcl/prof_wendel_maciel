#include<iostream>
using namespace std;
int pesquisaLinear(int vetor[], int tamanho, int valor, int &passos){
    for(int i = 0; i < tamanho; i++){
        passos++;
        if(valor == vetor[i]){
            return i;
        }
    }
    return -1;
}


int main(){
    int vetor[] = {45, 2, 23, 72, 5, 16, 8, 56, 38, 12};
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