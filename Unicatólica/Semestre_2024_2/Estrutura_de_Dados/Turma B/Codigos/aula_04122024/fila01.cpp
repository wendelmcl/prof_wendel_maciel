#include <iostream>
#include <queue>
using namespace std;

int main(){
    // Criando a fila
    queue<string> palavras;
    // Inserindo elementos
    palavras.push("Palavra1");
    palavras.push("Palavra2");
    palavras.push("Palavra3");
    palavras.push("Palavra4");
    palavras.push("Palavra5");
    cout << "Tamanho da fila: " << palavras.size() << endl;
    cout << "Primeiro elemento: " << palavras.front() << endl;
    cout << "Último elemento: " << palavras.back() << endl;

    while(!palavras.empty()){
        cout << "Elemento: " << palavras.front() << endl;
        palavras.pop();
    }
    return 0;
}