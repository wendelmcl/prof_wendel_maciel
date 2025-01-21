#include <iostream>
using namespace std;
struct Celula{
    int conteudo;
    Celula *proximo;
};
//Inicializar a lista com o cabeçalho
Celula *criarLista(){
    Celula *cabecalho = new Celula();
    cabecalho->conteudo = 0;
    cabecalho->proximo = nullptr;
    return cabecalho;
}

void inserirNoInicio(Celula *cabecalho, int valor){
    Celula *nova_celula = new Celula();
    nova_celula->conteudo = valor;
    nova_celula->proximo = cabecalho->proximo;
    cabecalho->proximo = nova_celula;
    cabecalho->conteudo++;
}

void exibirElementos(Celula *cabecalho){
    Celula *auxiliar = cabecalho->proximo;
    cout << "Lista: " << endl;
    while(auxiliar != nullptr){
        cout << auxiliar->conteudo << " ";
        auxiliar = auxiliar->proximo;
    }
    cout << endl;
}

int main(){
    Celula *cabecalho = criarLista();
    inserirNoInicio(cabecalho, 10);
    inserirNoInicio(cabecalho, 20);
    inserirNoInicio(cabecalho, 30);
    exibirElementos(cabecalho);
    cout << "Tamanho da lista: " << cabecalho->conteudo << endl;

    return 0 ;
}