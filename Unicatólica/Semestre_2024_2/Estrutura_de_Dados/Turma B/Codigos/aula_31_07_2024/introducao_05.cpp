#include <iostream>
using namespace std;
int main()
{
    float n1=0.0, n2=0.0, media=0.0;
    cout << "Digite N1: ";
    cin >> n1;
    cout << "Digite N2: ";
    cin >> n2;
    
    media = (n1+n2)/2;
    cout << "Média: " << media << "\n";
    
    if(media >= 7){
        cout << "Aprovado";
    }else if(media >= 4 && media < 7){
        cout << "AP3";
    }else{
        cout << "Reprovado";
    }
    
    return 0;
}