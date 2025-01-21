#include <iostream>
using namespace std;

int main(){
    int n1;
    int* pont;
    n1 = 10;
    pont = &n1;
    cout << "N1: " << n1 << endl;
    *pont = 30;
    cout << "N1 alterado pelo ponteiro: " << n1 << endl;
    return 0;
}