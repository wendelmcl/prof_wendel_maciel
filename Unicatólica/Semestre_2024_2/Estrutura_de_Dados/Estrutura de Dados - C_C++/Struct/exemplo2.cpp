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
        cout << "Marca: " << marca << "\n";
        cout << "Cor: " << cor << "\n";
        cout << "Preco: " << preco << "\n\n";
    }
};
int main() {
    Carro c1;
    
    c1.cadastrarCarros("Marca01", "Preto",10000);
    c1.imprimirDados();
    
    return 0;
}