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
//Função para adicionar um elemento no início da lista
void inserirNoInicio(Celula *cabecalho, int valor){
    Celula *nova_celula  = new Celula();
    nova_celula->conteudo = valor;
    nova_celula->proximo = cabecalho->proximo;
    cabecalho->proximo = nova_celula;
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
    //Inserir elementos no início
    inserirNoInicio(cabecalho, 10);
    inserirNoInicio(cabecalho, 20);
    inserirNoInicio(cabecalho, 30);
    exibirLista(cabecalho);
    cout << "Tamanho da lista: " << cabecalho->conteudo << endl;

    return 0;
}