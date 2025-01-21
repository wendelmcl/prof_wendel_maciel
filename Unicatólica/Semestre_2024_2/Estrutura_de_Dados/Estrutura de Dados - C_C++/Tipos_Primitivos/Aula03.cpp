#include <iostream>

using namespace std;

int main(){
    char saida;
    saida = 'a';
    cout << saida << endl;

    int a;
    float b;
    double c;
    char d;
    long int e;
    bool f;

    cout << "Inteiro: " << sizeof(a)<< endl;
    cout << "Float: " << sizeof(b)<< endl;
    cout << "Double: " << sizeof(c)<< endl;
    cout << "Char: " << sizeof(d)<< endl;
    cout << "Long Int: " << sizeof(e)<< endl;
    cout << "Bool: " << sizeof(f)<< endl;

    return 0;
}