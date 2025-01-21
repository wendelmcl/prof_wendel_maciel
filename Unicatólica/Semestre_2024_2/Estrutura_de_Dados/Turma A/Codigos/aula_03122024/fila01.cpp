#include <iostream>
#include <queue>
using namespace std;

int main(){
    //Criando uma fila
    queue<string> palavras;
    //Inserindo elementos
    palavras.push("palavra1");
    palavras.push("palavra2");
    palavras.push("palavra3");
    palavras.push("palavra4");
    palavras.push("palavra5");
    cout << "Tamanho da fila: " << palavras.size() << endl;
    cout << "Primeira palavra: " << palavras.front() << endl;
    cout << "Última palavra: " << palavras.back() << endl;
    while(!palavras.empty()){
        cout << "Elemento: " << palavras.front() << endl;
        palavras.pop();
    }
    return 0;
}