#include <iostream>
using namespace std;

struct Celula{
    int elemento;
    Celula *proximo;
};

Celula *criarLista(){
    Celula *cabecalho = new Celula();
    cabecalho -> elemento = 0;
    cabecalho -> proximo = nullptr;
    return cabecalho;
}

void inserirNoFinal(Celula *cabecalho, int valor){
    Celula *nova_celula = new Celula();
    nova_celula -> elemento = valor;
    nova_celula -> proximo = nullptr;

    Celula *atual = cabecalho;
    while(atual->proximo != nullptr){
        atual = atual->proximo;
    }
    atual->proximo = nova_celula;
    cabecalho->elemento++;
}

void exibirLista(Celula *cabecalho){
    Celula *imprime = cabecalho->proximo;
    while(imprime != nullptr){
        cout << imprime->elemento << " ";
        imprime = imprime->proximo;
    }
    cout << endl;
}

int main(){
    Celula *cabecalho = criarLista();
    inserirNoFinal(cabecalho, 10);
    inserirNoFinal(cabecalho, 20);
    inserirNoFinal(cabecalho, 30);
    inserirNoFinal(cabecalho, 40);

    cout << "Lista: " << endl;
    exibirLista(cabecalho);

    cout << "Tamanho da lista: " << cabecalho->elemento << endl;

    return 0;
}