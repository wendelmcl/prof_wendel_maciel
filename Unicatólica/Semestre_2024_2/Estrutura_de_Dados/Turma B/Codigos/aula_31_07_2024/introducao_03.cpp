#include <iostream>

using namespace std;

int main()
{
    float n1 = 0.0, n2 = 0.0, soma=0.0, media=0.0;
    cout<<"Digite a n1: ";
    cin>>n1;
    cout<<"Digite a n2: ";
    cin>>n2;
    soma=n1+n2;
    media = soma/2;
    cout<<"Soma: "<<soma<<"\n";
    cout<<"Media: "<<media;
    return 0;
}