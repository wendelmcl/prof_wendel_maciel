#include <stdio.h>

void fibonacci(int n){
    int anterior = 1, atual = 1, proximo = 0;
    for(int i = 3; i<= n; i++){
        proximo = anterior + atual;
        anterior = atual;
        atual = proximo;
        printf("%d ", proximo);
    }
}

int fibonacci_2(int n){
    int anterior = 1, atual = 1, proximo = 0;
    for(int i = 3; i<= n; i++){
        proximo = anterior + atual;
        anterior = atual;
        atual = proximo;
    }
    return proximo;
}

int main()
{
    int n = 0;
    printf("Digite um valor: ");
    scanf("%d", &n);
    printf("Quantidade de posições: %d", n);
    printf("\n%d %d ", 1, 1);
    fibonacci(n);
    printf("\nO valor da posição %d na sequência de Fibonacci é: %d", n, fibonacci_2(n));

    return 0;
}