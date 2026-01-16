#include <stdio.h>
int fibonacci_recursivo(int n){
    if(n == 1){
        return 1;
    }else if(n == 2){
        return 1;
    }else{
        return fibonacci_recursivo(n-2) + fibonacci_recursivo(n-1);
    }
}

int main()
{
    int n = 0;
    printf("Digite um valor: ");
    scanf("%d", &n);
    
    printf("O valor da posição %d na sequência de Fibonacci é: %d", n, fibonacci_recursivo(n));

    return 0;
}