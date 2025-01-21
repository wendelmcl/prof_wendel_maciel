#include <iostream>
using namespace std;
int main() {
    int matriz[4][4];
    int soma = 0;
    for(int i = 0; i < 4; i++){
        for(int j = 0; j < 4; j++){
            cout << "Digite um valor na Matriz["<<i<<"]["<<j<<"]: ";
            cin >> matriz[i][j];
        }
    }
    cout << endl;
    cout << "Diagonal Principal" << endl; 
    for(int i = 0; i < 4; i++){
        for(int j = 0; j < 4; j++){
            if(i == j){
                cout << "Matriz["<<i<<"]["<<j<<"]: " << matriz[i][j]<<endl;
                soma = soma + matriz[i][j];
            }
        }
    }
    cout << "Soma da Diagonal Principal: " << soma << endl;
    return 0;
}