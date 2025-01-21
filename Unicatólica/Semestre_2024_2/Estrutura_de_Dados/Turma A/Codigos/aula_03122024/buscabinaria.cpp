#include <iostream>
using namespace std;
int busca_binaria(int vetor[], int tamanho, int valor){
    int inicio = 0, fim = tamanho - 1, meio = 0;
    while(inicio <= fim){
        meio = inicio + (fim - inicio)/2;
        if(vetor[meio] == valor){
            return meio;
        }else if(vetor[meio] < valor){
            inicio = meio + 1;
        }else{
            fim = meio - 1;
        }
    }
    return -1;
}

int main(){
    int posicao = 0, valor = 0;
    int vetor[3] = {10, 20, 30};
    sort(vetor, vetor + 3);
    cout << "Digite o valor: ";
    cin >> valor;
    posicao = busca_binaria(vetor, 3, valor);
    cout << "Posicao: " << posicao << endl;
    return 0;
}