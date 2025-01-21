#include <iostream>
using namespace std;

struct Celula
{
    int conteudo;
    Celula *proximo;
};

Celula *criarLista(){
    Celula *cabecalho = new Celula();
    cabecalho->conteudo = 0;
    cabecalho->proximo = nullptr;
    return cabecalho;
}

void inserirNoFim(Celula *cabecalho, int valor){
    Celula *nova_celula = new Celula();
    nova_celula->conteudo = valor;
    nova_celula->proximo = nullptr;

    Celula *posicao_atual = cabecalho;
    while(posicao_atual->proximo != nullptr){
        posicao_atual = posicao_atual->proximo;
    }
    posicao_atual->proximo = nova_celula;
    cabecalho->conteudo++;
}

void exibirLista(Celula *cabecalho){
    Celula *contador = cabecalho->proximo;
    cout << "Lista: " << endl;
    while(contador != nullptr){
        cout << contador->conteudo << " ";
        contador = contador ->proximo;
    }
    cout << endl;
}

int main(){
    Celula *cabecalho = criarLista();

    inserirNoFim(cabecalho, 10);
    inserirNoFim(cabecalho, 20);
    inserirNoFim(cabecalho, 30);
    inserirNoFim(cabecalho, 40);

    exibirLista(cabecalho);
    cout << "Tamanho da lista: " << cabecalho->conteudo << endl;

    return 0;
}