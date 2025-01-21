#include <iostream>
#include <vector>
using namespace std;
int main(){
    vector<int> v1;
    cout << "Vector vazio? " << v1.empty() << endl;
    v1.push_back(10);
    v1.push_back(9);
    v1.push_back(8);
    cout << "Vector vazio? " << v1.empty() << endl;
    for(int i = 0; i < v1.size(); i++){
        cout << v1[i] << endl;
    }
    v1.pop_back();
    cout << "Vector atualizado: " << endl;
    for(int i = 0; i < v1.size(); i++){
        cout << v1[i] << endl;
    }
    return 0;
}