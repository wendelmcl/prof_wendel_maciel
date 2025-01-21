#include <iostream>

using namespace std;

int main(){
    string veiculo="Carro";
    string *pv;

    pv = &veiculo; // Ponteiro pv recebe o endereço de memória de veiculo

    cout << pv << "\n" << &veiculo;
    *pv = "Moto"; // No endereço apontado por *pv adicione o valor "Moto"

    cout << "\n" << veiculo << "\n" << *pv;

    return 0;
}