#include <iostream>
#include <queue>
using namespace std;
int main(){
    //Criando uma fila
    queue<string> fila_01, fila_02;
    //Inserindo elementos na fila
    fila_02.push("Ana");
    fila_02.push("Pedro");
    fila_02.push("Maria");
    fila_02.push("Carlos");

    cout << "Tamanho da fila_01: " << fila_01.size() << endl;
    cout << "Primeiro elemento FILA_02: " << fila_02.front() << endl;
    cout << "Ultimo elemento FILA_02: " << fila_02.back() << endl;
    fila_02.swap(fila_01);
    cout << "Tamanho da fila_01: " << fila_01.size() << endl;
    while(!fila_01.empty()){
        cout << "Elementos: " << fila_01.front() << endl;
        fila_01.pop();
    }
    return 0;
}