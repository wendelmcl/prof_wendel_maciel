#include <iostream>
#include <vector>

using namespace std;

int main(){

    vector<int> num1;
    vector<int> num2;
    int tam1, tam2, i;

    //Adicionar itens ao vector

    num1.push_back(1);
    num1.push_back(2);
    num1.push_back(3);
    num1.push_back(4);
    num1.push_back(5);

    num2.push_back(6);
    num2.push_back(7);
    num2.push_back(8);
    num2.push_back(9);
    num2.push_back(10);

    // Inserir elemento no início do Vector
    num1.insert(num1.begin(), 0);
    // Remover um elemento do Vector
    num1.erase(num1.begin());

    // num1.insert(num1.begin()+1, 0);
    // num1.insert(num1.end(), 0);
    // num1.insert(num1.end()-1, 0);

    //Tamanho do Vector
    tam1 = num1.size();
    tam2 = num2.size();
    cout << "Tamanho do Vector: " << tam1 << endl;

    //Imprimir primeiro elemento do vector
    cout << "Primeiro valor de num1: " << num1.front() << endl;
    //Imprimir o último elemento do vector
    cout << "Último valor de num1: " << num1.back() << endl;
    //Imprimir o valor do meio do vector
    cout << "Valor do meio: " << num1.at(tam1/2) << endl;

    //Troca de valores
    num1.swap(num2);

    for(i=0; i<tam1 ;i++){
        cout << num1[i] << " ";
    }
    cout << endl;

    for(i=0; i<tam2 ;i++){
        cout << num2[i] << " ";
    }

    while(!num1.empty()){
        num1.pop_back();
    }

    num2.clear();

    cout << endl;
    cout << "Novo tamanho de num1: " << num1.size();

    cout << endl;
    cout << "Novo tamanho de num2: " << num2.size();

    return 0;
}