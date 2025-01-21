//Incluindo a biblioteca iostream
#include <iostream>
//Não utilizar o std
using namespace std;
//Função principal - int
int main()
{
    //Declarando uma variável - booleano
    bool opcao = true;
    //Criando uma condicional
    if(opcao == true)
    {
        //Imprimindo uma mensagem
        cout << "Verdade";
    }
    //Continuação da condicional
    else
    {
        //Imprimindo uma mensagem
        cout << "Falso";
    }
    //Retornando um valor inteiro para a função main
    return 0;
}