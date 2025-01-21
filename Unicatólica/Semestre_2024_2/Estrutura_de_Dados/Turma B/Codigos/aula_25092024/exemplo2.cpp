#include <iostream>
using namespace std;
int calcularFatorial(int n1){
    int fatorial = 1;
    for(int i = 1; i <= n1; i++){
        fatorial = fatorial * i;
    }
    return fatorial;
}
int main(){
    int valor = 0, resultado = 0;
    cout << "Valor: " << endl;
    cin >> valor;
    resultado = calcularFatorial(valor);
    cout << "Fatorial: " << resultado << endl;
    return 0;
}