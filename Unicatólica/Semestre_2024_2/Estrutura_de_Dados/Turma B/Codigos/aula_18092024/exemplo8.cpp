#include <iostream>
using namespace std;

void somar(float* pont, float valor){
    *pont = *pont + valor;
}

int main(){
    float n1 = 5.0;
    somar(&n1, 10.0);
    cout << "N1: " << n1 << endl;
    return 0;
}