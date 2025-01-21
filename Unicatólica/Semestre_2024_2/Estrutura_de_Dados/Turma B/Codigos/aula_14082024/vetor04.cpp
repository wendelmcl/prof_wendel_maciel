#include <iostream>
using namespace std;
float calcularMedia(int vet[], int tamanho){
    float soma=0.0, media=0.0;
    for(int i=0; i < tamanho; i++){
        soma = soma + vet[i];
    }
    media = soma/tamanho;
    return media;
}

float somar(int vet[], int tamanho)
{
    float soma = 0.0;
    for(int i = 0; i < tamanho; i++){
        soma = soma + vet[i];
    }
    return soma;
}

void imprimir(int vet[], int tamanho){
    for (int i = 0; i < tamanho; i++){
        cout << "Vetor["<<i<<"] = " << vet[i]<< endl;
    }
}

int main(){
    int tamanho = 0;
    float soma = 0.0, media = 0.0;
    cout << "Digite o tamanho do vetor: ";
    cin >> tamanho;
    int vet[tamanho];
    for(int i = 0; i < tamanho; i++){
        cout << "Digite o valor: ";
        cin >> vet[i];
    }
    
    imprimir(vet, tamanho);
    soma = somar(vet, tamanho);
    media = calcularMedia(vet, tamanho);
    cout << "Soma: " << soma << endl;
    cout << "Media: " << media << endl;
    return 0;
}