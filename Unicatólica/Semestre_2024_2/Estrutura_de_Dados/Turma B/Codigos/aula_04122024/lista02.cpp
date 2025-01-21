#include <iostream>
#include <list>
using namespace std;

int main(){
    list<int> numeros;
    list<int>::iterator it;
    numeros.push_front(1);
    numeros.push_front(2);
    numeros.push_front(3);
    cout << "Tamanho da lista: " << numeros.size() << endl;
    it = numeros.begin();
    advance(it, 3);
    numeros.insert(it, 100);
    cout << "Tamanho da lista: " << numeros.size() << endl;
    while(!numeros.empty()){
        cout << numeros.front() << endl;
        numeros.pop_front();
    }

    return 0;
}