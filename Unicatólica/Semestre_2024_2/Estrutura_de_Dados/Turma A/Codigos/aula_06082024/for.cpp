#include <iostream>
using namespace std;
int main()
{
    float nota=0.0, soma=0.0, media=0.0;
    for(int i=0; i < 5; i++){
        cout << "Digite uma nota: ";
        cin >> nota;
        soma = soma + nota;
    }
    cout << "Soma: " << soma << "\n";
    media = soma/5;
    cout << "Média: " << media;
    return 0;
}