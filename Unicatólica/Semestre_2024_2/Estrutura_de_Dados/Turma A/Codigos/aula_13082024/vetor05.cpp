#include <iostream>
using namespace std;

int somar(int vet[], int tamanho){
    int soma = 0;
    for(int i = 0; i < tamanho; i++){
        soma = soma + vet[i];
    }
    return soma;
}

void imprimir(int vet[], int tamanho){
    for(int i = 0; i < tamanho; i++){
        cout << "Vetor["<<i<<"] = " << vet[i] << endl;
    }
}

int main()
{
    int tamanho = 0, soma = 0;
    cout << "Digite o tamanho do vetor: ";
    cin >> tamanho;
    int vet[tamanho];
    for(int i = 0; i < tamanho; i++){
        cout << "Digite o valor: ";
        cin >> vet[i];
    }
    imprimir(vet, tamanho);
    soma = somar(vet, tamanho);
    cout << "Soma: " << soma << endl;
    return 0;
}