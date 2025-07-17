#include <iostream>
using namespace std;

int calcularFatorial(int n){
    if(n <= 1){
        return 1;
    }else{
        return n * calcularFatorial(n - 1);
    }
}

int main(){
    int n1 = 0;
    cout << "Digite n1: ";
    cin >> n1;
    int resultado = calcularFatorial(n1);
    cout << "A fatorial de " << n1 << " = " << resultado << endl;

    return 0;
}