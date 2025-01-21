#include <iostream>
using namespace std;
int main()
{
    float nota=0.0, soma=0.0, media=0.0;
    int i = 0;
    while(i < 5){
        cout << "Digite uma nota: ";
        cin >> nota;
        soma = soma + nota;
        i++;
    }
    cout << "Soma: " << soma << "\n";
    media=soma/5;
    cout << "Média: " << media;
    return 0;
}