#include <iostream>
#include <queue>
using namespace std;
int main() {
    // Criando uma fila
    queue <string> palavras;
    //Inserindo elementos na fila
    palavras.push("Francisco");
    palavras.push("Wendel");
    palavras.push("de");
    palavras.push("Lima");
    palavras.push("Maciel");
    
    cout << "Tamanho da fila: " << palavras.size() << "\n";
    cout << "Primeira palavra: " << palavras.front() << "\n";
    cout << "última palavra: " << palavras.back() << "\n";
    
    while(!palavras.empty()){
        cout << "Elemento: " << palavras.front() << "\n";
        palavras.pop();
    }
    return 0;
}