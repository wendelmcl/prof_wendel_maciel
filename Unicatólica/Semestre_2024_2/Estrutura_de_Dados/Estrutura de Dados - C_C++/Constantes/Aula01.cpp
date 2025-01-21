#include <iostream>

using namespace std;

#define altura 10
#define largura 5
#define pulalinha '\n'


int main(){
    const int altura2 = 8;
    const int largura2 = 20;
    const char pulalinha2 = '\n';
    int area;
    int area2;
    area = altura * largura;
    cout << area;
    cout << pulalinha;
    cout << pulalinha;
    cout << "Pulou a linha" << endl << endl;

    area2 = altura2 * largura2;
    cout << area2;
    cout << pulalinha2;
    cout << pulalinha2;
    cout << "Pulou a linha";

    return 0;
}