#include <iostream>
using namespace std;

int somar(int a, int b){
    if(b == 0){
        return a;
    }else{
        return somar(a + 1, b - 1);
    }
}


int main(){
    int n1 = 0, n2 = 0;
    cout << "Digite n1: ";
    cin >> n1;
    cout << "Digite n2: ";
    cin >> n2;
    int resultado = somar(n1, n2);
    cout << "A soma de " << n1 << " + " << n2 << " = " << resultado << endl;
    return 0;
}