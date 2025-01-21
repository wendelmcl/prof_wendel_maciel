#include <iostream>
using namespace std;

int busca_sequencial(int vetor[], int valor){
    for(int i = 0; i < 9; i++){
        if(vetor[i] == valor){
            return i;
        }
    }
    return -1;
}

int main(){
    int valor = 0, resultado = 0;
    int vetor[9] = {1,2,3,4,6,9,10,12,15};
    cout << "Digite um valor: ";
    cin >> valor;
    resultado = busca_sequencial(vetor, valor);
    cout << "Posicao: " << resultado << endl;
    return 0;
}