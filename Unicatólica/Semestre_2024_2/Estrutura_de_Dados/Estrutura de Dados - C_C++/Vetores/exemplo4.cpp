#include <iostream>

using namespace std;

int main(){
    int vet[4] = {1,2,3,4};
    int j = 3;
    for(int i = 0; i < 4; i++){
        cout << "Vetor["<<i<<"] = " << vet[i] << endl;
    }
    
    cout << endl;
    cout << "##### Vetor Invertido #####" << endl;
    cout << endl;

    for(int i = 0; i < 4; i++){
        cout << "Vetor["<<i<<"] = " << vet[j] << endl;
        j = j - 1;
    }


    return 0;
}