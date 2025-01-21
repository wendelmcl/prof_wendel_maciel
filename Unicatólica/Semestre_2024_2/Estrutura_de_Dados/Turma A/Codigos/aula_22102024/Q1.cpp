#include <iostream>
using namespace std;

int potencia(int base, int expoente){
    int resultado = 1;
    for(int i = 1; i<=expoente; i++){
        resultado = resultado * base;
    }
    return resultado;
}
int main(){
    int base, expoente;
    cout << "Digite o valor da base: ";
    cin >> base;
    cout << "Digite o valor do expoente: ";
    cin >> expoente;
    int resultado = potencia(base, expoente);
    cout << "Resultado: " << resultado << endl;

    return 0;
}