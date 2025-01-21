#include <iostream>
using namespace std;

int main(){
    string veiculo = "Carro";
    string* pont;
    pont = &veiculo;
    cout << pont << " " << &veiculo << endl;
    //0xxx " " Carro
    *pont = "Moto";
    cout << veiculo << " " << *pont << endl;
    //Moto " " Moto
    return 0;
}