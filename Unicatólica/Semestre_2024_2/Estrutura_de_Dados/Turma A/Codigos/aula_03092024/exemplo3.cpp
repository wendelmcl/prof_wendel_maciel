#include <iostream>
#include <stack>
using namespace std;

int main(){
    //Declarando uma pilha
    stack<string> palavras;
    if(palavras.empty()){
        cout << "Pilha vazia" << endl;
    }else{
        cout << "Pilha com elementos" << endl;
    }
    //Inserindo elementos na pilha
    palavras.push("Ana");
    palavras.push("Carlos");
    palavras.push("Edu");
    palavras.push("Maria");

    if(palavras.empty()){
        cout << "Pilha vazia";
    }else{
        cout << "Pilha com elementos";
    }

    cout << "Tamanho da pilha: " << palavras.size() << endl;
    cout << "Palavras do topo: " << palavras.top() << endl;
    palavras.pop();
    cout << "Tamanho da pilha: " << palavras.size() << endl;
    cout << "Palavras do topo: " << palavras.top() << endl;
    palavras.push("Flavia");
    cout << "Palavras do topo: " << palavras.top() << endl;
    while (!palavras.empty())
    {
        cout << "Elementos: " << palavras.top() << endl;
        palavras.pop();
    }
    


    return 0;
}