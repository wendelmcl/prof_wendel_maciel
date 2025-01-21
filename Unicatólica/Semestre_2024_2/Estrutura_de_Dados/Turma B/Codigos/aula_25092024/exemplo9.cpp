#include <iostream>
using namespace std;

int main(){
    string veiculo = "Carro";
    string* ponteiro;
    ponteiro = &veiculo;
    cout << "Endereco de memoria de veiculo: " << &veiculo << endl;
    cout << "Endereco de memoria de veiculo pelo ponteiro: " << ponteiro << endl;
    cout << "Veiculo: " << veiculo << endl; 
    cout << "Veiculo pelo ponteiro: " << *ponteiro << endl;
    *ponteiro = "Moto";
    cout << "Veiculo: " << veiculo << endl; 
    cout << "Veiculo pelo ponteiro: " << *ponteiro << endl;
    return 0;
}