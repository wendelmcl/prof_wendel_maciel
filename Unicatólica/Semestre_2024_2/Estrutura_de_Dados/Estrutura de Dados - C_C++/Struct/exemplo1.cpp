#include <iostream>
using namespace std;
struct Carro{
    string marca;
    string cor;
    float preco;
};
int main() {
    Carro c1;
    Carro c2;
    c1.marca = "Marca1";
    c1.cor="Preto";
    c1.preco = 3000;
    
    c2.marca = "Marca2";
    c2.cor = "Azul";
    c2.preco = 5000;
    
    cout << "Marca: " << c1.marca << "\n";
    cout << "Cor: " << c1.cor << "\n";
    cout << "Preco: " << c1.preco << "\n\n";
    
    cout << "Marca: " << c2.marca << "\n";
    cout << "Cor: " << c2.cor << "\n";
    cout << "Preco: " << c2.preco << "\n\n";
    return 0;
}