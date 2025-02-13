#include <iostream>
using namespace std;
#define MAX 100
void inserir_elementos(int vetor[], int &tamanho, int elemento){
    if(tamanho < MAX){
        vetor[tamanho] = elemento;
        tamanho++;
    } else {
        cout << "Vetor cheio" << endl;
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
    int vetor[MAX];
    int tamanho = 0;
    inserir_elementos(vetor, tamanho, 4);
    inserir_elementos(vetor, tamanho, 2);
    inserir_elementos(vetor, tamanho, 1);
    inserir_elementos(vetor, tamanho, 8);
    inserir_elementos(vetor, tamanho, 5);
    
    imprimir_elementos(vetor, tamanho);
}