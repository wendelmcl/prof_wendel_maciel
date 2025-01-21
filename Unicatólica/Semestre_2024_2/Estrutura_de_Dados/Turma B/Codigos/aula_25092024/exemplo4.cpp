#include <iostream>
using namespace std;

int main(){
    int vetor[5];
    int soma = 0;

    for(int i = 0; i < 5; i++){
        cout << "Digite um valor: ";
        cin >> vetor[i];
    }

    for(int i = 0; i < 5; i++){
        soma = soma + vetor[i];
    }
    cout << "Somatorio: " << soma << endl;
    return 0;
}