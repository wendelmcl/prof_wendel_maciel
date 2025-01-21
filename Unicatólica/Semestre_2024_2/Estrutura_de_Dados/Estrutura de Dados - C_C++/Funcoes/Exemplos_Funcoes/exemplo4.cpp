#include <iostream>

using namespace std;

int fatorial(int numero){
    if(numero == 0){
        return 1;
    }else{
        return numero*fatorial(numero-1);
    }

}


int main(){
    int numero = 0;
    cout << "Digite um valor: ";
    cin >> numero;

   cout << "Fatorial: " << fatorial(numero);

    return 0;
}
