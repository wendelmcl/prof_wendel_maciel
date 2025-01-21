#include <iostream>
#include <queue>
using namespace std;
int main() {
    //Criando uma fila
    queue<int> fila_01, fila_02;
    //Inserindo elementos na fila 02
    fila_02.push(10);
    fila_02.push(20);
    fila_02.push(30);
    fila_02.push(40);
    fila_02.push(50);
    //Imprimindo a quantidade de elementos da fila_01
    cout << "Quantidade de elementos da fila 01 : " << fila_01.size() << "\n";
    //Trocando o conteúdo da fila_02 para a fila_01
    fila_02.swap(fila_01);
    //Imprimindo a quantidade de elementos da fila_01
    cout << "Quantidade de elementos da fila 01 : " << fila_01.size() << "\n";
    cout << "Quantidade de elementos da fila 02 : " << fila_02.size() << "\n";
    //Imprimindo o primeiro elemento da fila 01
    cout << "Primeiro elemento: " << fila_01.front() << "\n";
    //Imprimindo o último elemento da fila 01
    cout << "último elemento: " << fila_01.back() << "\n";
    //Imprimindo o tamanho da fila
    cout << "Tamanho da fila 01: " << fila_01.size() << "\n";
    
    //Imprimindo os elementos da fila
    while(!fila_01.empty()){
        cout << "Imprimindo elemento: " << fila_01.front() << "\n";
        fila_01.pop();
    }
    return 0;
}