#include <iostream>
using namespace std;

int main(){
    int vetor[5] = {10, 20, 30, 40, 50};
    int* pont = vetor;

    for(int i = 0; i < 5; i++){
        cout << "Valor["<<i<<"]: " << *(pont + i) << endl;
    }
    return 0;
}