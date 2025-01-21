#include <iostream>
#include <list>
using namespace std;
int main(){
    list<int> lista;
    int tam = 5;
    list<int>::iterator it;
    for(int i = 0; i < tam; i++){
        lista.push_front(i);
    }
    cout << "Tamanho da lista: " << lista.size() << endl;
    it = lista.begin();
    advance(it, 5);
    lista.insert(it, 50);
    cout << "Tamanho da lista: " << lista.size() << endl;
    tam = lista.size();
    for(int i = 0; i < tam; i++){
        cout << "Elementos: " << lista.front() << endl;
        lista.pop_front();
    }
    return 0;
}