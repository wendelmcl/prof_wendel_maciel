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

    cout << "Lista: " << endl;
    
    imprimirLista(cabecalho);
    return 0;
}