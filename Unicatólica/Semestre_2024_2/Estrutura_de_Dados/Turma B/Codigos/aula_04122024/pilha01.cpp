#include <iostream>
#include <stack>
using namespace std;

int main(){
    // Criando uma pilha
    stack<string> palavras;
    // Inserindo elementos na pilha
    palavras.push("palavra1");
    palavras.push("palavra2");
    palavras.push("palavra3");
    palavras.push("palavra4");
    palavras.push("palavra5");

    cout << "Tamanho da pilha: " << palavras.size() << endl;
    cout << "Elemento do topo da pilha: " << palavras.top() << endl;
    while(!palavras.empty()){
        cout << "Elementos: " << palavras.top() << endl;
        palavras.pop();
    }

    return 0;
}