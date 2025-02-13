#include <iostream>
using namespace std;


int vetor(int vet[], int tam, int valor){
    int i;
    for(i = 0; i < tam; i++){
        if(valor == vet[i]){
            return i;
        }
    }
    return i;
}


int main(){

    int vet[5] = {5,1,8,7,3};
    int contador = 0;
    sort(vet, vet+5);
    for(int i = 0; i < 5; i++){
        cout << vet[i] << " ";
    }
    contador = vetor(vet, 5, 10);
    cout << endl;
    cout << "Passos: " << contador << endl;

}