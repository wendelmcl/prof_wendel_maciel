#include <iostream>
#include <vector>

using namespace std;

int main(){

    vector<int> v1 = {1, 2, 3, 4, 5};
    vector<int>:: iterator it;
    it= v1.begin()+2;
    v1.erase(it);
    for(vector<int>::iterator it = v1.begin(); it != v1.end(); it++ ){
        cout << *it << " ";
    }
    cout << endl;

    return 0;
}