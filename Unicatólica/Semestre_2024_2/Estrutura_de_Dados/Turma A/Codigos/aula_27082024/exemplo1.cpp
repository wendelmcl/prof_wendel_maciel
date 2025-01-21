#include <iostream>
#include <list>
using namespace std;

int main(){
    list<int> lista;
    const int TAM = 5;
    for(int i = 0; i < TAM; i++){
        lista.push_front(i);
    }
    cout << "Tamanho da lista: " << lista.size() << endl;
    for(int i = 0; i < TAM; i++){
        cout << "Elementos: " << lista.front() << endl;
        lista.pop_front();
    }
    return 0;
}