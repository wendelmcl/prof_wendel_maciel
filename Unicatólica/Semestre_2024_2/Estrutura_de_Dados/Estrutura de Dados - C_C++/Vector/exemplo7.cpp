#include <iostream>
#include <vector>

using namespace std;

int main(){

    vector<int> v1 = {1, 2, 3, 4, 5, 6, 7, 8};
    vector<int>:: iterator it1;
    vector<int>:: iterator it2;
    it1= v1.begin()+3;
    it2 = v1.begin()+6;

    v1.erase(it1, it2);
    for(vector<int>::iterator it = v1.begin(); it != v1.end(); it++ ){
        cout << *it << " ";
    }
    cout << endl;

    return 0;
}