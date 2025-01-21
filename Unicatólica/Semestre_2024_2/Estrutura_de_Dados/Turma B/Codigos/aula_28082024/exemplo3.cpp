#include <iostream>
#include <list>
using namespace std;
int main(){
    list<int> lista;
    int tam = 5;
    list<int>::iterator it;
    lista.push_front(9);
    lista.push_front(0);
    lista.push_front(5);
    lista.push_front(3);
    lista.push_front(7);
    cout << "Tamanho da lista: " << lista.size() << endl;
    lista.sort();
    for(int i = 0; i < tam; i++){
        cout << lista.front() << endl;
        lista.pop_front();
    }
    cout << "Tamanho da lista: " << lista.size() << endl;
    lista.push_front(9);
    lista.push_front(0);
    lista.push_front(5);
    lista.push_front(3);
    lista.push_front(7);
    lista.sort();
    lista.reverse();
    cout << "Tamanho da lista: " << lista.size() << endl;
    for(int i = 0; i < tam; i++){
        cout << lista.front() << endl;
        lista.pop_front();
    }

    return 0;
}