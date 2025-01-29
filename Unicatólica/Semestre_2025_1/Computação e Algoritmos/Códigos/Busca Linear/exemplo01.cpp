#include <iostream>
using namespace std;

int posicao(int vetor[], int tam, int valor){
    int i;
    for(i = 0; i < tam; i++){
        if(valor == vetor[i]){
            return i;
        }
    }
    return -1;
}

int main(){
    int vetor[10] = {5,9,10,4,6,3,1,2,8,7};
    int pos = 0;
    pos = posicao(vetor, 10, 2);
    cout << "Posição: " << pos << endl;
}