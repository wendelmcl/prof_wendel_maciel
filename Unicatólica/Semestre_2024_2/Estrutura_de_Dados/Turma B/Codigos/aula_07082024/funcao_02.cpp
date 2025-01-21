#include <iostream>
using namespace std;

int somar(int n1, int n2){
    int resultado = 0;
    resultado = n1+n2;
    return resultado;
    }

int main()
{
    int resultado = 0;
    cout << "Resultado: " << somar(10, 20) << endl;
    cout << "Resultado: " << somar(50, 20) << endl;
    resultado = somar(10, 200);
    cout << "Resultado: " << resultado << endl;
    return 0;
}