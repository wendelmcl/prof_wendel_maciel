#include <iostream>
using namespace std;

int main(){
    int *pont;
    int vetor[5];
    pont = vetor;
    cout << pont << endl;
    pont = &vetor[1];
    cout << pont << endl;
    (pont = pont + 1);
    cout << pont << endl;
    return 0;
}