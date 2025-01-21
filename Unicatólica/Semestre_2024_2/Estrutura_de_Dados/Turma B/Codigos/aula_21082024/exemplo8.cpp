#include <iostream>
#include <vector>
using namespace std;

int main(){
    vector<int>v1;
    vector<int>v2;
    v1.push_back(1);
    v1.push_back(2);
    v1.push_back(3);
    v1.push_back(4);
    v2.push_back(5);
    v2.push_back(6);
    v2.push_back(7);
    v2.push_back(8);

    for(vector<int>::iterator it = v1.begin(); it != v1.end(); it++){
        cout << *it << " " << endl;
    }
    cout << endl;
    v1.swap(v2);
    for(vector<int>::iterator it = v1.begin(); it != v1.end(); it++){
        cout << *it << " " << endl;
    }
    return 0;
}