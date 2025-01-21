#include <iostream>
#include <vector>
using namespace std;

int main(){
    int tamanhoV1, tamanhoV2, numero;
    cout << "Digite o tamanho do Vector 1: ";
    cin >> tamanhoV1;
    cout << "Digite o tamanho do Vector 2: ";
    cin >> tamanhoV2;
    vector<int>v1;
    vector<int>v2;
    vector<int>v3;

    cout << "Vector 1: " << endl;
    for(int i = 0; i < tamanhoV1; i++){
        cout << "Digite o valor: ";
        cin >> numero;
        v1.push_back(numero);
    }
    cout << "Vector 2: " << endl;
    for(int i = 0; i < tamanhoV2; i++){
        cout << "Digite o valor: ";
        cin >> numero;
        v2.push_back(numero);
    }
    cout << "Conteudo Vector 1: " << endl;
    for(int i = 0; i < tamanhoV1; i++){
        cout << v1[i] << " ";
    }
    cout << endl;

    cout << "Conteudo Vector 2: " << endl;
    for(int i = 0; i < tamanhoV2; i++){
        cout << v2[i] << " ";
    }

    v3.insert(v3.end(), v1.begin(), v1.end());
    v3.insert(v3.end(), v2.begin(), v2.end());

    cout << "Conteudo Vector 3: " << endl;
    for(int i = 0; i < v3.size(); i++){
        cout << v3[i] << " ";
    }

    return 0;
}