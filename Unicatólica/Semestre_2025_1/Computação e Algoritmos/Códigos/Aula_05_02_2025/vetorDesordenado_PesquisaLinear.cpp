#include <iostream>
using namespace std;


int vetor(int vet[], int tam, int valor){
    for(int i = 0; i < tam; i++){
        if(valor == vet[i]){
            return i;
        }
    }
    return -1;
}


int main(){

    int vet[5] = {5,1,8,7,3};
    int posicao = 0;
    posicao = vetor(vet, 5, 10);
    cout << "Posição: " << posicao << endl;

}