#include <iostream>
#include <vector>
using namespace std;

int main(){
    const int TAM = 5;
    vector<int> v1;
    vector<int>::iterator it;
    for(int i = 0; i < TAM; i++){
        v1.push_back(i);
    }
    v1.insert(v1.begin(), 10);
    it = v1.end()-1;
    v1.erase(it);
    for(vector<int>::iterator it = v1.begin(); it != v1.end(); it++){
        cout << *it << " " << endl;
    }
    return 0;
}