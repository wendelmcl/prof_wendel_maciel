int potencia(int n1, int n2){
    int resultado = 1;
    for(int i = 0; i < n2; i++){
        resultado = resultado * n1;
    }
    return resultado;
}


#include <stdio.h>

int main()
{
    int n1 = 0, n2 = 0;
    printf("Digite n1 e n2: \n");
    scanf("%d %d", &n1, &n2);
    
   printf("O resultado de %d elevado a %d é: %d", n1, n2, potencia(n1, n2));

    return 0;
}