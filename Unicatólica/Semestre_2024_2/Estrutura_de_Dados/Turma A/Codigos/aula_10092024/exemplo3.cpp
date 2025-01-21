#include <iostream>
using namespace std;

struct No{
    int dados;
    No* proximo_elemento;
};
void inserirNoFim(No*& inicio, int valor){
    No* novo_no = new No();
    novo_no->dados = valor;
    novo_no->proximo_elemento = nullptr;
    if(inicio == nullptr){
        inicio = novo_no;
    }else{
        No* teste = inicio;
        while(teste->proximo_elemento != nullptr){
            teste = teste->proximo_elemento;
        }
        teste->proximo_elemento = novo_no;
    }
}

void exibirLista(No* inicio){
    No* teste = inicio;
    while(teste != nullptr){
        cout << teste->dados << " ";
        teste = teste->proximo_elemento;
    }
    cout << endl;
}

int main(){
    No* inicio = nullptr;

    inserirNoFim(inicio, 10);
    inserirNoFim(inicio, 20);
    inserirNoFim(inicio, 30);
    cout << "Lista: ";
    exibirLista(inicio);

    return 0;
}