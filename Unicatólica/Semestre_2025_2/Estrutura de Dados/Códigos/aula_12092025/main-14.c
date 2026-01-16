#include <stdio.h>

int calcularFatorial(int n1){
    int fatorial = 1;
    if(n1 == 0){
        return 1;
    }else {
        for(int i = 1; i <= n1; i++){
            fatorial = fatorial * i;
        }
        return fatorial;
    }
}

int main()
{
    int n1, resultado;
    printf("Digite um número: ");
    scanf("%d", &n1);
    resultado = calcularFatorial(n1);
    printf("O fatorial de %d é igual a %d", n1, resultado);
    return 0;
}