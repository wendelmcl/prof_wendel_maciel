#include <iostream>
#include <queue>
using namespace std;
int main(){
    //Declarar uma lista
    queue<string> palavras;
    //Inserindo elementos na fila
    palavras.push("Curso: ");
    palavras.push("SI");
    palavras.push("Semestre: ");
    palavras.push("4º");
    cout << "Tamanho da fila: " << palavras.size() << endl;
    cout << "Primeiro elemento: " << palavras.front() << endl;
    cout << "Ultimo elemento: " << palavras.back() << endl;

    while(!palavras.empty()){
        cout << "Elemento: " << palavras.front() << endl;
        palavras.pop();
    }
    return 0;
}