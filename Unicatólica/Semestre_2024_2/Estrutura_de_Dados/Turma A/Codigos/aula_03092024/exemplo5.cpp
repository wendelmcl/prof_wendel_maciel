#include <iostream>
using namespace std;
struct Carro{
    string marca;
    string cor;
    float preco;

    void cadastrarCarros(string stMarca, string stCor, float stPreco){
        marca = stMarca;
        cor = stCor;
        preco = stPreco;
    }

    void imprimirDados(){
        cout << "Marca: " << marca << endl;
        cout << "Cor: " << cor << endl;
        cout << "Preco: " << preco << endl;
    }
};

int main(){
    Carro c1;
    c1.cadastrarCarros("FIAT", "AZUL", 1000);
    c1.imprimirDados();
    return 0;
}