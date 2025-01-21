#include <iostream>
using namespace std;
int main()
{
    int soma = 0, valor=0;
    for(int i=0; i < 5; i++){
        cout << "Digite um valor: ";
        cin >> valor;
        soma = soma+valor;
        }
        cout << "Soma: " << soma << "\n";
        return 0;
}