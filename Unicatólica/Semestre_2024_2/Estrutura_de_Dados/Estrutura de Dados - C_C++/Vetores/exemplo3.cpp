#include <iostream>
#include <locale.h>

using namespace std;

int main(){
    setlocale(LC_ALL,"portuguese");
    int tam = 0;
    float soma = 0.0, media = 0.0;
    cout << "Digite o tamanho do vetor: ";
    cin >> tam;
    int vet[tam];

    for(int i = 0; i < tam; i++){
        cout << "Digite um valor: ";
        cin >> vet[i];
        soma = soma + vet[i];
    }

    for(int i = 0; i < tam; i++){
        cout << "Vetor["<<i<<"] = " <<vet[i] << endl;
    }

    media = soma / tam;

    cout << "A soma dos valores e: " << soma << endl;
    cout << "A media dos valores e: " << media << endl;


    return 0;
}