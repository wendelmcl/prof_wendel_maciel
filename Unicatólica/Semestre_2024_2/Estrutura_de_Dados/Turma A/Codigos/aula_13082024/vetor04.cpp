#include <iostream>
using namespace std;

int main()
{
    int tamanho = 0, contImpar = 0;
    cout << "Digite o tamanho do vetor: ";
    cin >> tamanho;
    int vet[tamanho];
    // 3,4,6,10,7
    for(int i = 0; i < tamanho; i++){
        cout << "Digite o valor: ";
        cin >> vet[i];
    }
    
    for(int i = 0; i < tamanho; i++){
        cout << "Vetor["<<i<<"] = " << vet[i] << endl;
    }
    
    for(int i = 0; i < tamanho; i++){
        if(vet[i] % 2 != 0){
            cout << "Impares: " << vet[i] << endl;
            contImpar++;
            cout << "Posicao numero Impar: " << i << endl;
        }
    }
    cout << "Quantidade de numeros impares: " << contImpar << endl;
    return 0;
}