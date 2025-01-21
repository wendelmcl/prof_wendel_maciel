#include <iostream>
using namespace std;

int main(){
    int a = 20;
    int* p = &a;

    cout << "Valor de a: " << a << endl;
    *p = 50;
    cout << "Valor de a: " << a << endl;

    return 0;
}