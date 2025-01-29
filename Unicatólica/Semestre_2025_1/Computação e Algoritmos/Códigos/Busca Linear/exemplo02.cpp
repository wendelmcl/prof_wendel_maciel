#include <iostream>
using namespace std;

int qtd_passos(int vetor[], int tam, int valor){
    int i;
    for(i = 0; i < tam; i++){
        if(valor == vetor[i]){
            return i+1;
        }
    }
    return i+1;
}

int main(){
    int vetor[10] = {5,9,10,4,6,3,1,2,8,7};
    int passos = 0;
    passos = qtd_passos(vetor, 10, 2);
    cout << "Passos: " << passos << endl;
}