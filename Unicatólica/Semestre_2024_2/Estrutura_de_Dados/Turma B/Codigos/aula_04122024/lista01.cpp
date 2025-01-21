#include <iostream>
#include <list>
using namespace std;
int main(){
    list<int> numeros;
    numeros.push_front(1);
    numeros.push_front(2);
    numeros.push_front(3);
    numeros.push_front(4);
    numeros.push_front(5);
    cout << "Tamanho da lista: " << numeros.size() << endl;
    while(!numeros.empty()){
        cout << "Elementos: " << numeros.front() << endl;
        numeros.pop_front();
    }

    return 0;
}