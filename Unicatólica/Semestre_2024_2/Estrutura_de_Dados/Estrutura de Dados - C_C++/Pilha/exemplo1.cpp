#include <iostream>
#include <stack>
using namespace std;
int main() {
    //Criando uma pilha
    stack <string> palavras;
    //Verificando se a pilha possui elementos
    if(palavras.empty()){
        cout << "Pilha Vazia.\n\n";
    }else{
        cout << "Pilha com elementos.\n\n";
    }
    //Inserindo dados em uma pilha
    palavras.push("Francisco");
    palavras.push("Wendel");
    palavras.push("de");
    palavras.push("Lima");
    palavras.push("Maciel");
    if(palavras.empty()){
        cout << "Pilha Vazia.\n\n";
    }else{
        cout << "Pilha com elementos.\n\n";
    }
    
    cout << "Tamanho da Pilha: " << palavras.size() << " elementos. " << "\n";
    cout << "Palavra do topo da pilha: " << palavras.top() << "\n";
    //Retirando o elemento do topo da pilha.
    palavras.pop();
    
    cout << "Tamanho da Pilha: " << palavras.size() << " elementos. " << "\n";
    cout << "Palavra do topo da pilha: " << palavras.top() << "\n";
    
    palavras.push("Maciel");
    
    while(!palavras.empty()){
        cout << "Elemento retirado: " << palavras.top() << "\n";
        palavras.pop();
    }
    return 0;
}