#include <iostream>

using namespace std;

int fatorial(int numero){
    int fat = 1;
    for(int i = 1; i<=numero; i++){
        fat = fat * i;
    }

    return fat;
}


int main(){
    int numero = 0;
    cout << "Digite um valor: ";
    cin >> numero;

   cout << "Fatorial: " << fatorial(numero);

    return 0;
}
