#include<iostream>
using namespace std;

int somar(int n1, int n2)
{
    int soma = 0;
    soma = n1 + n2;
    return soma;
}

int main()
{
    int v1=0, v2=0;
    cout << "Digite um valor: ";
    cin >> v1;
    cout << "Digite um valor: ";
    cin >> v2;
    int resultado = somar(v1, v2);
    cout << "Soma: " << resultado << endl;
    return 0;
}