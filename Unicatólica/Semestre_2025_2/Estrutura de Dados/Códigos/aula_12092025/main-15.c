#include <stdio.h>

int main()
{
    int n1 = 0, vetor[5], soma = 0;
    float media = 0.0;
    for(int i = 0; i < 5; i++){
        printf("Digite um valor: ");
        scanf("%d", &vetor[i]);
        soma = soma + vetor[i];
    }
    media = (float)soma / 5;
    printf("Média Aritmética: %.2f", media);
}