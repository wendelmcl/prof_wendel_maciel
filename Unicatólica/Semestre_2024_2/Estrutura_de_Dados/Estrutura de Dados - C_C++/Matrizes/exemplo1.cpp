#include <iostream>

using namespace std;

int main(){

    int matriz[2][2];
    for(int i = 0; i < 2; i++){
        for(int j = 0; j < 2; j++){
            cout << "Digite o valor na Matriz["<<i<<"]["<<j<<"]: ";
            cin >> matriz[i][j];
        }
    }

    cout << "Impressao da Matriz." << endl;

    for(int i = 0; i < 2; i++){
        for(int j = 0; j < 2; j++){
            cout << "Matriz["<<i<<"]"<<"["<<j<<"]: " << matriz[i][j]<<endl;
        }
    }

    return 0;
}