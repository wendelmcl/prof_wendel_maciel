#include <iostream>
using namespace std;

int main(){
    int* pont;
    int vetor[5];
    pont = &vetor[0];
    *pont = 10;
    cout << "Vetor[0]: " << vetor[0] << endl;
    *(pont += 1);
    *pont = 20;
    cout << "Vetor[1]: " << vetor[1] << endl;
    *(pont+=1);
    *pont = 30;
    cout << "Vetor[2]: " << vetor[2] << endl;
    return 0;
}