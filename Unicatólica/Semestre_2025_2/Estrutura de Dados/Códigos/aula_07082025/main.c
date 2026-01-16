#include <stdio.h>

int main()
{
    int var = 10;
    float n = 5.8;
    char texto[] = "Olá, mundo!";
    printf("Inteiro: %d \n", var);
    printf("Float: %.2f \n", n);
    printf("Texto: %s \n", texto);
    printf("O número é: %d e o texto é: %s \n", var, texto);
    printf("Sistemas de Informação");
    printf("Digite um valor: ");
    scanf("%d", &var);
    printf("O novo valor é: %d", var);
    return 0;
}