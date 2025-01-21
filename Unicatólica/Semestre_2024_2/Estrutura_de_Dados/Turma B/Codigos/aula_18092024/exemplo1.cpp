#include <iostream>
using namespace std;

int main(){
    int n1;
    int* pont;
    n1 = 10;
    pont = &n1;
    cout << "N1: " << n1 << endl;
    cout << "Ponteiro: " << pont << endl;
    cout << "Valor de N1 pelo Ponteiro: " << *pont << endl; 
    return 0;
}