#include <iostream>
using namespace std;

int main(){
    int vetor[5] = {2,3,5,7,9};
    int soma = 0;
    for(int i = 0; i < 5; i++){
        soma = soma + vetor[i];
    }
    cout << "Somatorio: " << soma << endl;
    return 0;
}