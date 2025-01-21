#include <iostream>
using namespace std;
int main() {
    int matriz[2][2];
    for(int i = 0; i < 2; i++){
        for(int j = 0; j < 2; j++){
            cout << "Digite um valor na Matriz["<<i<<"]["<<j<<"]: ";
            //Matriz[0][0]: 30
            //Matriz[0][1]: 45
            //Matriz[1][0]: 28
            //Matriz[1][1]: 37
            cin >> matriz[i][j];
        }
    }
    cout << endl;
    for(int i = 0; i < 2; i++){
        for(int j = 0; j < 2; j++){
            cout << "Matriz["<<i<<"]["<<j<<"]: " << matriz[i][j]<<endl;
        }
    }
    return 0;
}