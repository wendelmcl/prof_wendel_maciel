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
    Carro *carros = new Carro[2];
    Carro c1, c2;
    carros[0] = c1;
    carros[1] = c2;

    carros[0].cadastrarCarros("Marca01", "Preto", 2000);
    carros[1].cadastrarCarros("Marca02", "Branco", 1000);

    for(int i = 0; i < 2; i++){
        carros[i].imprimirDados();
    }
    return 0;
}