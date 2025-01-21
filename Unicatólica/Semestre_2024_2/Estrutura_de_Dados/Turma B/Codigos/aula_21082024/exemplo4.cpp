#include <iostream>
#include <vector>
using namespace std;

int main(){
    const int TAM = 5;
    vector<int> v1;
    for(int i = 0; i < TAM; i++){
        v1.push_back(i);
    }
    // – iterator it;
    // – it = v1.begin(); aponta para 1º elemento
    // – it = v1.end(); aponta para último elemento
    // – *it  elemento do vector referenciado por iterator
    // – it++ incrementa iterador; aponta para próximo elemento
    cout << "Conteudo do Vector: " << endl;
    for(vector<int>::iterator it = v1.begin(); it != v1.end(); it++){
        cout << *it << " " << endl;
}
    //Retorna o numero de elementos no vector
    cout << "Quantidade de elementos do vector: " << v1.size() << endl;
    //Retorna o numero de elementos que o vector pode conter sem alocar mais armazenamento
    cout << "Capacidade do vector: " << v1.capacity() << endl;
    //Retorna o tamanho máximo do vector
    cout << "Tamanho maximo do vector: " << v1.max_size() << endl;
    return 0;
}