#include <iostream>
#include <vector>
using namespace std;

int main(){
    vector<int>v1;
    v1.push_back(5);
    v1.push_back(4);
    v1.push_back(3);
    v1.push_back(2);
    v1.push_back(1);
    vector<int>::iterator it;
    it = v1.begin()+2;
    v1.erase(it);
    for(vector<int>::iterator it = v1.begin(); it != v1.end(); it++){
        cout << *it << " " << endl;
    }
    return 0;
}