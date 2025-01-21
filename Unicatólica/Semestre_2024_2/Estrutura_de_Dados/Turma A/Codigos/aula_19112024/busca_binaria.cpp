#include <iostream>
#include <algorithm>
using namespace std;

int busca_binaria(int vetor[], int tamanho, int valor){
    int inicio = 0, fim = tamanho - 1, meio = 0;
    while (inicio <= fim){
        meio = inicio + (fim - inicio) / 2;
        if(vetor[meio] == valor){
            return meio;
        }else if(vetor[meio] < valor){
            inicio = meio + 1;
        }else {
            fim = meio - 1;
        }
    }
    return - 1;
}

int main(){
    int resultado = 0, valor = 0;
    int vetor[5] = {50, 10, 30, 20, 40};
    sort(vetor, vetor + 5);
    cout << "Digite o valor: ";
    cin >> valor;
    resultado = busca_binaria(vetor, 5, valor);
    cout << "Posicao: " << resultado << endl;
    return 0;
}