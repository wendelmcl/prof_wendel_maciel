#include<iostream>
using namespace std;
struct Carro{
    string marca;
    string cor;
    float preco;
};
int main(){
    Carro c1;
    c1.marca="FIAT";
    c1.cor="Preto";
    c1.preco=2500.70;

    cout << "Marca: " << c1.marca << endl;
    cout << "Cor: " << c1.cor << endl;
    cout << "Preco: " << c1.preco << endl;

    return 0;
}