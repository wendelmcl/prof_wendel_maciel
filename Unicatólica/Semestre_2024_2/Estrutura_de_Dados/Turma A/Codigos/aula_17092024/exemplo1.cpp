#include <iostream>
using namespace std;

int main(){
    int a = 20, b = 10;
    int* p = &a;
    cout << "a: " << a << endl;
    cout << "ponteiro -> a: " << p << endl;
    cout << "ponteiro valor -> a: " << *p << endl;
    p = &b;
    cout << "b: " << b << endl;
    cout << "ponteiro -> b: " << p << endl;
    cout << "ponteiro valor -> b: " << *p << endl;

    return 0;
}