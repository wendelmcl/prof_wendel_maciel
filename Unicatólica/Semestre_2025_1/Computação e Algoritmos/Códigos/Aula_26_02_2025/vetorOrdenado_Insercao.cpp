#include <iostream>
using namespace std;
void inserirElemento(int vetor[], int &tamanho, int capacidade, int elemento){
    if(tamanho >= capacidade){
        cout << "Vetor cheio";
        return;
    }
    int i; 
    for(i = tamanho - 1; i >= 0 && vetor[i] > elemento; i--){
        vetor[i + 1] = vetor[i];
    }

    vetor[i + 1] = elemento;
    tamanho++;
}

void imprimirVetor(int vetor[], int tamanho){
    for(int i = 0; i < tamanho; i++){
        cout << vetor[i] << " ";
    }
    cout << endl;
}

int main(){
    int tamanho = 10, capacidade = 15, elemento = 0;
    int vetor[capacidade] = {2,5,8,12,16,23,38,45,56,72};
    cout << "Digite um novo elemento: ";
    cin >> elemento;
    imprimirVetor(vetor, tamanho);
    inserirElemento(vetor, tamanho, capacidade, elemento);
    cout << "Vetor após inserir elemento" << endl;
    imprimirVetor(vetor, tamanho);
    return 0;
}