#include <iostream>
using namespace std;
int main()
{
    int valor = 0, soma = 0;
    int i = 0;
    while(i<5){
        cout << "Digite um valor: ";
        cin >> valor;
        soma += valor;
        i++;
        }
        cout << "Soma: " << soma;
    return 0;
}