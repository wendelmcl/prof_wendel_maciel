#include <iostream>

using namespace std;

int main(){

    int matriz[3][3];
    for(int i = 0; i < 3; i++){
        for(int j = 0; j < 3; j++){
            cout << "Digite o valor na Matriz["<<i<<"]["<<j<<"]: ";
            cin >> matriz[i][j];
        }
    }
    cout << endl;
    cout << "Diagonal Principal." << endl;

    for(int i = 0; i < 3; i++){
        for(int j = 0; j < 3; j++){
            if(i == j){
                cout << "Matriz["<<i<<"]"<<"["<<j<<"]: "<<matriz[i][j]<<endl;
            }
        }
    }

    return 0;
}