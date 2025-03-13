#include <iostream>
using namespace std;

int buscaBinaria(int primos[], int valor){
    int min = 0, max = 24, mediana = 0;
    while(min <= max){
        mediana = (min + max) / 2;
        if(primos[mediana] == valor){
            return mediana;
        }else if(primos[mediana] < valor){
            min = mediana + 1;
        }else{
            max = mediana - 1;
        }
    }
    return -1;
}

int main(){
    int primos[] = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
    int valor = 0;
    cout << "Digite um valor: ";
    cin >> valor;
    int resultado = buscaBinaria(primos, valor);
    if(resultado != -1){
        cout << "O número " << valor << " é primo. Encontrado na posição " << resultado << "." << endl ;
    }else{
        cout << "O número " << valor << " não foi encontrado." << endl;
    }

    return 0;
}