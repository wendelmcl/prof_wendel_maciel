#include <iostream>
#include <vector>
using namespace std;

int main(){
    const int tamanho = 5;
    vector<int> v1(tamanho);
    vector<int> v2;
    cout << "Tamanho do Vector: " << v1.size() << endl;
    cout << "Vector está vazio? " << v1.empty() << endl;
    v1.resize(8);
    cout << "Tamanho do Vector: " << v1.size() << endl;
    return 0;
}