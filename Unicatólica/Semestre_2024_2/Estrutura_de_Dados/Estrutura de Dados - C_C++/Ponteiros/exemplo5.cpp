#include <iostream>

using namespace std;
void iniciarVetor(float *v);
int main(){
    float num = 0;
    float vetor[5];

    iniciarVetor(vetor);

    cout << num << "\n\n";

    for(int i = 0; i < 5; i++){
        cout << vetor[i] << "\n";
    }

    return 0;
}

void iniciarVetor(float *v){
    v[0] = 1;
    v[1] = 2;
    v[2] = 3;
    v[3] = 4;
    v[4] = 5;
}