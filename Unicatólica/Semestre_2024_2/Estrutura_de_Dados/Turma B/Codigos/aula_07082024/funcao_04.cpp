#include <iostream>
using namespace std;
int fatorial(int valor){
    int resultado = 1;
    for(int i=1; i<= valor; i++){
        resultado = resultado * i;
        }
        return resultado;
}

int main()
{
    int resultado = 0, valor = 0;
    cout << "Digite o valor: ";
    cin >> valor;
    resultado = fatorial(valor);
    cout << "Fatorial: " << resultado << endl;
    
    return 0;
}