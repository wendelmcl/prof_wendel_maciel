#include <iostream>
#include <vector>
using namespace std;

int main(){
    vector<int> v1;
    cout << "Vazio? " << v1.empty() << endl;
    //Insere os elementos no final do Vector
    v1.push_back(10);
    v1.push_back(9);
    v1.push_back(8);

    for(int i = 0; i < v1.size(); i++){
        cout << "Vector["<<i<<"]: " << v1[i]  << endl;
    }
    //Retira o último elemento do fim do Vector
    v1.pop_back();
    for(int i = 0; i < v1.size(); i++){
        cout << "Vector["<<i<<"]: " << v1[i]  << endl;
    }


    return 0;
}