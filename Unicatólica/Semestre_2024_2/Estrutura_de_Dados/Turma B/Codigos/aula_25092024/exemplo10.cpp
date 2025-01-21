#include <iostream>
using namespace std;

int main(){
    int vetor[5];
    int* ponteiro;
    ponteiro = vetor;
    cout << "Ponteiro: " << ponteiro << endl;
    ponteiro = &vetor[1];
    cout << "Ponteiro: " << ponteiro << endl;
    (ponteiro = ponteiro + 1);
    cout << "Ponteiro: " << ponteiro << endl;
    return 0;
}