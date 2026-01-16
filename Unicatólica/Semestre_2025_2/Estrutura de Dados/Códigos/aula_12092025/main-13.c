#include <stdio.h>

int main()
{
    int n1, resultado;
    printf("Digite um numero para ver a tabuada: ");
    scanf("%d", &n1);
    printf("--- Tabuada do %d ---", n1);
    
    for(int i = 1; i <= 10; i++){
        resultado = n1 * i;
        printf("\n%d * %d = %d", n1, i, resultado);
    }
    return 0;
}