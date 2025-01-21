#include <iostream>
#include <vector>
using namespace std;

int main(){
    const int tamanho = 5;
    vector<int> v1;

    for(int i = 0; i < tamanho; i++){
        v1.push_back(i);
    }

    cout << "Conteúdo do Vector: " << endl;

    // – iterator it;
    // – it = v1.begin(); aponta para 1º elemento
    // – it = v1.end(); aponta para último elemento
    // – *it  elemento do vector referenciado por iterator
    // – it++ incrementa iterador; aponta para próximo elemento

    for(vector<int>::iterator it = v1.begin(); it != v1.end(); it++){
        cout << *it << " " << endl;
    }

    //Retorna o número de elementos no vetor.
    cout << "Tamanho do Vector: " << v1.size() << endl;
    //Retorna o número de elementos que o vetor pode conter sem alocar mais armazenamento.
    cout << "Capacidade do Vector: " << v1.capacity() << endl;
    //Retorna o tamanho máximo do vetor.
    cout << "Tamanho máximo do vetor: " << v1.max_size() << endl;

    return 0;
}