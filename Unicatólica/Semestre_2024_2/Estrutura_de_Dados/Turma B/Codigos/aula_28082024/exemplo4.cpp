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
    for(int i = 0; i < tam; i++){
        cout << lista.front() << endl;
        lista.pop_front();
    }
    for(int i = 0; i < tam; i++){
        lista.push_front(i);
    }
    it = lista.begin();
    advance(it, 3);
    lista.insert(it, 50);
    lista.sort();
    it = lista.begin();
    advance(it, 5);
    lista.erase(--it);
    cout << "Tamanho da lista: " << lista.size() << endl;
    tam = lista.size();
    for(int i = 0; i < tam; i++){
        cout << lista.front() << endl;
        lista.pop_front();
    }
    return 0;
}