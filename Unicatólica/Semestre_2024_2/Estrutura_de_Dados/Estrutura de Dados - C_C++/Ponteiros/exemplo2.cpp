#include <iostream>

using namespace std;

int main(){
    int *p;
    int vetor[10];
    p=vetor;
    cout << "\n" << p << "\n";

    p=&vetor[1];
    cout << "\n" << p << "\n";

    (p = p + 1);
    cout << "\n" << p << "\n";

    return 0;
}