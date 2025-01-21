#include <iostream>

using namespace std;

int main(){
    int tam = 3;
    int vet[tam];

    for(int i = 0; i < 3; i++){
        cout << "Digite um valor: ";
        cin >> vet[i];
    }

    for(int i = 0; i< 3; i++){
        cout << "Vetor["<<i<<"] = " << vet[i] << endl;
    }

    return 0;
}