#include <iostream>
#include <vector>
using namespace std;

int main(){
    vector<int> v1;
    v1.push_back(3);
    v1.push_back(2);
    v1.push_back(1);

    cout << "Conteudo do Vector: " << endl;
        // – iterator it;
    // – it = v1.begin(); aponta para 1º elemento
    // – it = v1.end(); aponta para último elemento
    // – *it  elemento do vector referenciado por iterator
    // – it++ incrementa iterador; aponta para próximo elemento
    for(vector<int>::iterator it = v1.begin(); it != v1.end(); it++){
        cout << *it << " " << endl;
    }
    //Retorna a capacidade maxima do vector
    cout << "Tamanho maximo do vector: " << v1.max_size() << endl;
    //Retorna a quantidade de elementos que pode conter no vector sem aumentar o armazenamento
    cout << "Capacidade do vector: " << v1.capacity() << endl;
    v1.resize(7);
    cout << "Capacidade do vector: " << v1.capacity() << endl;

    return 0;
}