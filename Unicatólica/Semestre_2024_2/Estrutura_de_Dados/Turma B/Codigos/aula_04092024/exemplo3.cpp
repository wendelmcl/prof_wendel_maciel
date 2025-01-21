#include <iostream>
#include <stack>
using namespace std;
int main(){
    //Criando uma pilha
    stack<string> palavras;
    //Verficando se a pilha tá vazia
    if(palavras.empty()){
        cout << "Pilha vazia" << endl;
    }else{
        cout << "Pilha com elementos" << endl;
    }
    palavras.push("Ana");
    palavras.push("Pedro");
    palavras.push("Maria");
    palavras.push("Carlos");
    cout << "Tamanho da pilha: " << palavras.size() << endl;
    cout << "Topo da pilha: " << palavras.top() << endl;
    palavras.pop();
    cout << "Tamanho da pilha: " << palavras.size() << endl;
    palavras.push("Mateus");

    while(!palavras.empty()){
        cout << "Elementos: " << palavras.top() << endl;
        palavras.pop();
    }
    return 0;
}