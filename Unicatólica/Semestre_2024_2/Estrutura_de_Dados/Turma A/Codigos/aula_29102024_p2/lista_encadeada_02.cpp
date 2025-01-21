#include <iostream>
using namespace std;

struct Celula{
    int conteudo;
    Celula *proximo;
};
//Função para inicilizar a lista com o cabeçalho
Celula *criarLista(){
    Celula *cabecalho = new Celula();
    cabecalho->conteudo = 0;
    cabecalho->proximo = nullptr;
    return cabecalho;
}
//Função para adicionar um elemento em uma posição da lista
void inserirNaPosicao(Celula *cabecalho, int valor, int posicao){
    Celula *nova_celula = new Celula();
    nova_celula->conteudo = valor;

    Celula *posicao_atual = cabecalho;
    int contador = 0;
    while(contador < posicao && posicao_atual->proximo!=nullptr){
        posicao_atual = posicao_atual->proximo;
        contador++;
    }
    // Insere o elemento após a célula atual
    nova_celula->proximo=posicao_atual->proximo;
    posicao_atual->proximo = nova_celula;
    cabecalho->conteudo++;
}
//Função para imprimir os elementos da lista
void exibirLista(Celula *cabecalho){
    Celula *contador = cabecalho->proximo;
    cout << "Lista: ";
    while(contador != nullptr){
        cout << contador->conteudo << " ";
        contador = contador->proximo;
    }
    cout << endl;
}

int main(){
    Celula *cabecalho = criarLista();
    //Inserir elementos em uma posição específica
    inserirNaPosicao(cabecalho, 10, 0);
    inserirNaPosicao(cabecalho, 20, 1);
    inserirNaPosicao(cabecalho, 30, 1);
    inserirNaPosicao(cabecalho,40, 5);
    cout << "Lista: ";
    exibirLista(cabecalho);
    cout << "Tamanho da lista: " << cabecalho->conteudo << endl;

    return 0;
}