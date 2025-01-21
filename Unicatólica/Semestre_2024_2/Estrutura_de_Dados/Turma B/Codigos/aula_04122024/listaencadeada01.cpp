#include <iostream>
using namespace std;

struct Celula{
    int elementos;
    Celula *proximo;  
};
// Criando a lista
Celula *criarLista(){
    Celula *cabecalho = new Celula();
    cabecalho->elementos = 0;
    cabecalho->proximo = nullptr;
    return cabecalho;
}
// Inserindo um elemento no início da lista
void inserirNoInicio(Celula *cabecalho, int valor){
    Celula *nova_celula = new Celula();
    nova_celula -> elementos = valor;
    nova_celula -> proximo = cabecalho->proximo;
    cabecalho->proximo = nova_celula;
    cabecalho->elementos++;
}

//Exibindo os elementos da lista
void exibirElementos(Celula *cabecalho){
    Celula *auxiliar = cabecalho->proximo;
    cout << "Lista: " << endl;
    while(auxiliar != nullptr){
        cout << auxiliar->elementos << " ";
        auxiliar = auxiliar->proximo;
    }
    cout << endl;
}

int main(){
    Celula *cabecalho = criarLista();
    //Inserindo os elementos no início da lista
    inserirNoInicio(cabecalho, 10);
    inserirNoInicio(cabecalho, 20);
    inserirNoInicio(cabecalho, 30);
    exibirElementos(cabecalho);
    cout << "Tamanho da lista: " << cabecalho->elementos << endl;
    return 0;
}