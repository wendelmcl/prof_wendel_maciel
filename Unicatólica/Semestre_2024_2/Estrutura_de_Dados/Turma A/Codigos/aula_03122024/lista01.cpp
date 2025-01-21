#include <iostream>
#include <list>
using namespace std;

int main(){
    list<int> valores;
    valores.push_front(1);
    valores.push_front(2);
    valores.push_front(3);
    valores.push_front(4);
    valores.push_front(5);
    cout << "Tamanho da lista: " << valores.size() << endl;
    int tam = valores.size();
    for(int i = 0; i < tam; i++){
        cout << "Elementos: " << valores.front() << endl;
        valores.pop_front();
    }

    return 0;
}