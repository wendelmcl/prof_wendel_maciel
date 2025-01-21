#include <iostream>
using namespace std;
int main() {
    int matriz[4][4];
    for(int i = 0; i < 4; i++){
        for(int j = 0; j < 4; j++){
            cout << "Digite um valor na Matriz["<<i<<"]["<<j<<"]: ";
            cin >> matriz[i][j];
        }
    }
    cout << endl;
    for(int i = 0; i < 4; i++){
        for(int j = 0; j < 4; j++){
            if(i % 2 == 0){
                cout << "Matriz["<<i<<"]["<<j<<"]: " << matriz[i][j]<<endl;
            }
        }
    }
    return 0;
}