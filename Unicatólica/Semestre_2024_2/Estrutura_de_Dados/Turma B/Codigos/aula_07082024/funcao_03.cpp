#include <iostream>
using namespace std;

int somatorio(int qtd_numeros){
    int valor = 0, soma = 0;
    for(int i = 0; i < qtd_numeros; i++){
        cout << "Digite um valor: ";
        cin >> valor;
        soma = soma + valor;
        }
        return soma;
}

int main()
{
    int numeros = 0, resultado = 0;
    cout << "Digite a quantidade de numeros: ";
    cin >> numeros;
    resultado = somatorio(numeros);
    cout << "Somatorio: " << resultado << endl;
    
    return 0;
}