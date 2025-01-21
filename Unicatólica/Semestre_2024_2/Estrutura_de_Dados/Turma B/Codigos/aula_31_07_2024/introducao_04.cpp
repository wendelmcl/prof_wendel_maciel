#include <iostream>

using namespace std;

int main()
{
    float c=0.0, f=0.0, c2=0.0;
    cout << "Digite a temperatura em Celsius: ";
    cin>>c;
    f=(c*9/5)+32;
    cout<<"De Celsius para Fahrenheit: "<<f<<"\n";
    
    cout<<"Digite o valor em Fahrenheit: ";
    cin>>f;
    c2=5*(f-32)/9;
    cout << "De Fahrenheit para Celsius: "<< c2;
    
    return 0;
}