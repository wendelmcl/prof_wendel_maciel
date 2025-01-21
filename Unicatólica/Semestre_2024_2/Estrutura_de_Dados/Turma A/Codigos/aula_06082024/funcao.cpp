#include <iostream>
using namespace std;

void somar(int n1, int n2){
    int soma = 0;
    soma = n1+ n2;
    cout << soma << "\n";
}

int resultado(int n1, int n2){
    int soma = 0;
    soma = n1+n2;
    return soma;
}
int main()
{
    somar(4,2);
    somar(10,20);
    cout << resultado(1,2) << "\n";
    
    return 0;
}