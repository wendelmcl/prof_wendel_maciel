#include <iostream>
using namespace std;

void bubbleSort(int vetor[], int tamanho){
    int temporaria = 0;
    for(int i = 0; i < tamanho - 1; i++){
        for(int j = 0; j < tamanho - i - 1; j++){
            if(vetor[j] > vetor[j+1]){
                temporaria = vetor[j];
                vetor[j] = vetor[j+1];
                vetor[j+1] = temporaria;
            }
        }
    }
}

int main(){
    int vetor[] = {64, 34, 25, 12, 22, 11, 90};
    int tamanho = 7;
    cout << "Vetor desordenado..." << endl;
    for(int i = 0; i < tamanho; i++){
        cout << vetor[i] << " ";
    }
    cout << endl;
    cout << "Vetor ordenado..." << endl;;
    bubbleSort(vetor, tamanho);
    for(int i = 0; i < tamanho; i++){
        cout << vetor[i] << " ";
    }
    return 0;
}