#include <iostream>
using namespace std;

int main()
{
    int tamanho = 0, soma = 0, maior=0, menor;
    cout << "Digite o tamanho do vetor: ";
    cin >> tamanho;
    int vet[tamanho];
    for(int i = 0; i < tamanho; i++){
        cout << "Digite o valor: ";
        cin >> vet[i];
    }
    
    for(int i = 0; i < tamanho; i++){
        if(maior < vet[i]){
            maior = vet[i];
        }if(menor > vet[i]){
            menor = vet[i];
        }
    }
    cout << "Maior valor: " << maior << endl;
    cout << "Menor valor : " << menor << endl;
    return 0;
}