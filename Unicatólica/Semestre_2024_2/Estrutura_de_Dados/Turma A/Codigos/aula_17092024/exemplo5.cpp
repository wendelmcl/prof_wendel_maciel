#include <iostream>
using namespace std;

int main(){
    string veiculo = "Carro";
    string *p = &veiculo;
    cout << p << " " << &veiculo;
    //endereco de memoria // Carro
    *p = "Moto";
    cout << endl;
    cout << veiculo << " " << *p;
    //Moto // Moto
    return 0;
}