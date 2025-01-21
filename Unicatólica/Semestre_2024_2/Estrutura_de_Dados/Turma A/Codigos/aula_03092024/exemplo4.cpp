#include <iostream>
using namespace std;
struct Carro{
    string marca;
    string cor;
    float preco;
};

int main(){
    Carro c1;
    c1.marca = "Teste";
    c1.cor = "preto";
    c1.preco = 2500.50;

    cout << "Marca: " << c1.marca << endl;
    cout << "Cor: " << c1.cor << endl;
    cout << "Preco: " << c1.preco << endl;

    return 0;
}