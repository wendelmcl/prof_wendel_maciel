#include <iostream>
#include <list>
using namespace std;

int main(){
    list<int> lista;
    list<int> teste;
    teste.push_front(9);
    teste.push_front(9);
    teste.push_front(9);
    teste.push_front(9);
    int TAM =5;
    list<int>::iterator it;
    for(int i=0; i < TAM; i++){
        lista.push_front(i);
    }
    it = lista.begin();
    advance(it, 3);
    lista.insert(it, 50);
    lista.sort();
    it = lista.begin();
    advance(it, 5);
    lista.erase(--it);

    lista.merge(teste);

    TAM = lista.size();
    cout << "Tamanho da lista: " << lista.size() << endl;
    for(int i = 0; i < TAM; i++){
        cout << "Elemento: " << lista.front() << endl;
        lista.pop_front();
    }


    return 0;
}