#include <iostream>
using namespace std;

int main(){
    int n1;
    int* pont;
    n1 = 10;
    pont = &n1;
    cout << "Valor de N1 pelo Ponteiro: " << *pont << endl;
    int n2 = 30;
    pont = &n2;
    cout << "Valor de N2 pelo ponteiro: " << *pont << endl;
    return 0;
}