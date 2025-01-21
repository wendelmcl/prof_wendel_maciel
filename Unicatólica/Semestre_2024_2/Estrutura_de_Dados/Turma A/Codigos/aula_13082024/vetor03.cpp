#include <iostream>
using namespace std;

int main()
{
    int tamanho = 0;
    cout << "Digite o tamanho do vetor: ";
    cin >> tamanho;
    int vet[tamanho];
    
    for(int i = 0; i < tamanho; i++){
        cout << "Digite o valor: ";
        cin >> vet[i];
    }
    
    for(int i = 0; i < tamanho; i++){
        cout << "Vetor["<<i<<"] = " << vet[i] << endl;
    }
    return 0;
}