#include <iostream>
using namespace std;

int main(){
    int a = 10, b=20;
    int *pont1, *pont2;
    pont1 = &a;
    pont2 = &b;
    cout << "Valor de a: " << a << endl;
    cout << "Valor de b: " << b << endl;
    *pont1 = 20;
    *pont2 = 10;
    cout << "Alterando os valores..." << endl;
    cout << "Valor de a: " << a << endl;
    cout << "Valor de b: " << b << endl;
    return 0;
}