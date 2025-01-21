#include <iostream>

using namespace std;

void fatorial(int numero){
    int fat = 1;
    for(int i = 1; i<=numero; i++){
        fat = fat * i;
    }

    cout << "Fatorial: " << fat;
}


int main(){
    int numero = 0;
    cout << "Digite um valor: ";
    cin >> numero;

    fatorial(numero);

    return 0;
}
