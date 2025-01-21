#include<iostream>
using namespace std;

int calcularFatorial(int n1){
    int soma = 1;
    for(int i = 1; i <= n1; i++){
        soma = soma * i;
    }
    return soma;
}

int main(){
    int numero = 0;
    cout << "Digite um numero: ";
    cin >> numero;
    int fatorial = calcularFatorial(numero);
    cout << "Fatorial: " << fatorial << endl;
    return 0;
}