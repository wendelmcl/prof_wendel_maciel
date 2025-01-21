#include <iostream>
#include <vector>

using namespace std;

int main(){
    vector<int> v1(5, -1);
    for(int i = 0; i < v1.size(); i++){
        cout << v1[i] << endl;
    }
    return 0;
}