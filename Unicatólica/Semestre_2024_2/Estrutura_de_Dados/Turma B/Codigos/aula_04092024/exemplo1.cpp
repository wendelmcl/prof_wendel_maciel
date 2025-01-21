#include <iostream>
#include <queue>
using namespace std;
int main(){
    //Criando uma fila
    queue<string> palavras;
    //Inserindo elementos na fila
    palavras.push("Ana");
    palavras.push("Pedro");
    palavras.push("Maria");
    palavras.push("Carlos");

    cout << "Tamanho da fila: " << palavras.size() << endl;
    cout << "Primeiro elemento: " << palavras.front() << endl;
    cout << "Ultimo elemento: " << palavras.back() << endl;
    while(!palavras.empty()){
        cout << "Elementos: " << palavras.front() << endl;
        palavras.pop();
    }

    return 0;
}