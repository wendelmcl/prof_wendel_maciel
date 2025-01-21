#include <iostream>
#include <vector>
using namespace std;
int main(){
    int tamanho = 5;
    vector<int> v1(tamanho);
    cout << "Tamanho do vector: " << v1.size() << endl;
    cout << "Vector vazio? " << v1.empty() << endl;
    v1.resize(8);
    cout << "Novo tamanho do vector: " << v1.size() << endl;
    return 0;
}