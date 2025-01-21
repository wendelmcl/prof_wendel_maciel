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
    Carro *carros = new Carro[2];
    Carro c1, c2;
    carros[0] = c1;
    carros[1] = c2;
    
    carros[0].cadastrarCarros("Marca01", "Preto", 20000);
    carros[1].cadastrarCarros("Marca02", "Azul", 5000);
    
    for(int i = 0; i < 2 ; i++){
        carros[i].imprimirDados();
    }
    return 0;
}