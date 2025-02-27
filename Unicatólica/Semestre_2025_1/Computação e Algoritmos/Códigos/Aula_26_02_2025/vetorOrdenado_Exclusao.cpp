#include <iostream>
using namespace std;
void removerElemento(int vetor[], int &tamanho, int elemento){
    int posicao = -1;
    for(int i = 0; i < tamanho; i++ ){
        if(vetor[i] == elemento){
            posicao = i;
            break;
        }
    }
    if(posicao == -1){
        cout << "Elemento não encontrado" << endl;
        return;
    }
    for(int i = posicao; i < tamanho; i++){
        vetor[i] = vetor[i + 1];
    }
    tamanho--;
    cout << "Elemento: " << elemento << " removido" << endl;
}

void imprimirVetor(int vetor[], int tamanho){
    for(int i = 0; i < tamanho; i++){
        cout << vetor[i] << " ";
    }
    cout << endl;
}

int main(){
    int tamanho = 10, elemento = 0;
    int vetor[] = {2,5,8,12,16,23,38,45,56,72};
    cout << "Digite um elemento para remover: ";
    cin >> elemento;
    imprimirVetor(vetor, tamanho);
    removerElemento(vetor, tamanho, elemento);
    imprimirVetor(vetor, tamanho);
    return 0;
}