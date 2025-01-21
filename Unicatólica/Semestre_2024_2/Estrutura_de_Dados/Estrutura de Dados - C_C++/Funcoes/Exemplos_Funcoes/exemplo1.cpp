#include <iostream>

using namespace std;

int main(){
    int numero = 0, fatorial=1;
    cout << "Digite um valor: ";
    cin >> numero;

    for(int i = 1; i<=numero; i++){
        fatorial = fatorial * i;
    }

    cout << "Fatorial: " << fatorial;

    return 0;
}
