#include <iostream>
#include <list>
using namespace std;

int main(){
    //Criando uma lista
    list<int> valores;
    //Iterator para percorrer uma coleção de dados
    list<int>::iterator it;
    valores.push_front(1);
    valores.push_front(2);
    valores.push_front(3);
    cout << "Tamanho da lista: " << valores.size() << endl;
    it = valores.begin();
    advance(it, 3);
    valores.insert(it, 100);
    cout << "Tamanho da lista: " << valores.size() << endl;
    int tam = valores.size();
    for(int i = 0; i < tam; i++){
        cout << valores.front() << endl;
        valores.pop_front();
    }
    return 0;
}