#include <stdio.h>

int main()
{
    int n1, n2, soma, subtracao, multiplicacao, divisao;
    printf("Digite N1: ");
    scanf("%d", &n1);
    printf("Digite N2: ");
    scanf("%d", &n2);
    soma = n1 + n2;
    subtracao = n1 - n2;
    multiplicacao = n1 * n2;
    divisao = n1 / n2;
    
    printf("--- Resultados ---");
    printf("\nSoma: %d", soma);
    printf("\nSubtração: %d", subtracao);
    printf("\nMultiplicação: %d", multiplicacao);
    printf("\nDivisão: %d", divisao);

    return 0;
}