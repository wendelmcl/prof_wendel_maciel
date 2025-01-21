#include <iostream>
using namespace std;

struct Celula{
    int elementos;
    Celula *proximo; 
};

void inserirNoInicio(Celula *&cabecalho, int valor){
    Celula *nova_celula = new Celula();
    nova_celula->elementos = valor;
    nova_celula->proximo = cabecalho;
    cabecalho = nova_celula;
}

void inserirEmUmaPosicao(Celula *&cabecalho, int valor, int posicao){
    Celula *nova_celula = new Celula();
    nova_celula->elementos = valor;

    if(posicao == 0){
        nova_celula->proximo = cabecalho;
        cabecalho = nova_celula;
        return;
    }

    Celula *posicao_atual = cabecalho;
    for(int i = 0; i < posicao - 1 && posicao_atual != nullptr; i++){
        posicao_atual = posicao_atual->proximo;
    }

    if(posicao_atual == nullptr){
        cout << "Posicao invalida"<< endl;
        Celula *temporario = cabecalho;
        while(temporario->proximo != nullptr){
            temporario = temporario->proximo;
        }
        temporario->proximo = nova_celula;
        nova_celula->proximo = nullptr;
        return;
    }
    nova_celula->proximo = posicao_atual->proximo;
    posicao_atual->proximo = nova_celula;
}

void imprimirLista(Celula *cabecalho){
    Celula *pont = cabecalho;
    while(pont != nullptr){
        cout << pont->elementos << " ";
        pont = pont->proximo;
    }
    cout << endl;
}

int main(){
    Celula *cabecalho = nullptr;
    inserirNoInicio(cabecalho, 10);
    inserirNoInicio(cabecalho, 20);
    inserirNoInicio(cabecalho, 30);
    inserirEmUmaPosicao(cabecalho, 40, 0);
    inserirEmUmaPosicao(cabecalho, 50, 1);
    inserirEmUmaPosicao(cabecalho, 60, 1);
    inserirEmUmaPosicao(cabecalho, 70, 5);

    cout << "Lista: " << endl;
    
    imprimirLista(cabecalho);
    return 0;
}