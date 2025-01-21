#include <iostream>
using namespace std;

int main()
{
    int vet[] = {1,2,3,4,5}, soma=0;
    float media = 0.0;
    for(int i = 0; i < 5; i++){
        soma = soma + vet[i];
    }
    media = soma / 5;
    
    cout << "Soma de elementos do vetor: " << soma << endl;
    cout << "Media: " << media << endl;
    return 0;
}