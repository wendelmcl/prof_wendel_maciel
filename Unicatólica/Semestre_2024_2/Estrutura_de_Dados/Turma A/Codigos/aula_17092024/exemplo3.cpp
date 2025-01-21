#include <iostream>
using namespace std;

int main(){
    int vetor[5] = {10, 20, 30, 40 ,50};
    int* p = vetor;

    for(int i = 0; i < 5; i++){
        cout << "Valor["<<i<<"]: " << *(p + i) << endl;
    }

    return 0;
}