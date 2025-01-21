#include <iostream>
#include <vector>
using namespace std;
int main(){
    vector<int> v1;
    v1.push_back(10);
    v1.push_back(9);
    v1.push_back(8);

    for(int i = 0; i < v1.size(); i++){
        cout << v1[i] << endl;
    }
    v1.pop_back();
    for(int i =0; i < v1.size(); i++){
        cout << "Elementos: " << v1[i] << endl;
     }
    return 0;
}