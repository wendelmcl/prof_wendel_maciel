#include <iostream>
using namespace std;

int main(){
    int tamanho = 0;
    float media = 0.0, soma = 0.0;
    cout << "Digite o tamanho do vetor: ";
    cin >> tamanho;
    int vet[tamanho];
    for(int i = 0; i < tamanho; i++){
        cout << "Digite o valor: ";
        cin >> vet[i];
        soma = soma + vet[i];
    }
    for (int i = 0; i < tamanho; i++){
        cout << "Vetor["<<i<<"] = " << vet[i]<< endl;
    }
    media = soma/tamanho;
    cout << "Somatorio: " << soma << endl;
    cout << "Media: " << media << endl;
    return 0;
}