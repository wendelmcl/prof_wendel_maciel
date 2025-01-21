#include <iostream>
using namespace std;

int main(){
    int* p = new int; //Alocando um inteiro
    *p = 100; //Atribuindo um valor ao espaço de memória
    cout << "Valor alocado: " << *p << endl;
    delete p;
    cout << "Valor desalocado: " << *p << endl;
    return 0;
}