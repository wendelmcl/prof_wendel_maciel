#include <iostream>
using namespace std;
struct Produto{
    string nome;
    float preco;
    int quantidade;
};

int main(){
    Produto p1;
    cout << "Digite o nome do produto: ";
    cin >> p1.nome;
    cout << "Digite o preco: ";
    cin >> p1.preco;
    cout << "Digite a quantidade: ";
    cin >> p1.quantidade;

    float valorTotal = p1.preco * p1.quantidade;
    cout << "Valor total do estoque: " << valorTotal << endl;

    return 0;
}