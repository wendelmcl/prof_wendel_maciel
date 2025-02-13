#include <iostream>
using namespace std;
#define MAX 100
void excluir_elemento(int vetor[], int &tamanho, int elemento){
    for(int i = 0 ; i < tamanho; i++){
        if(vetor[i] == elemento){
            vetor[i] = vetor[tamanho - 1];
            tamanho--;
        }else if(i == tamanho - 1){
            cout << "Elemento não encontrado" << endl;
        }
    }
}

void imprimir_elementos(int vetor[], int tamanho){
    cout << "Vetor: ";
    for(int i = 0; i < tamanho; i++){
        cout << vetor[i] << " ";
    }
    cout << endl;
}
int main(){
    int vetor[MAX] = {4,2,1,8,5};
    int tamanho = 5;
    imprimir_elementos(vetor, tamanho);
    excluir_elemento(vetor, tamanho, 1);
    imprimir_elementos(vetor, tamanho);

    return 0;
}