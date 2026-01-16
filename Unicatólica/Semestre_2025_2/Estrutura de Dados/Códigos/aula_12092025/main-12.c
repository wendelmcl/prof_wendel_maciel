#include <stdio.h>

int main()
{
    float nf;
    printf("Digite a nota final: ");
    scanf("%f", &nf);
    if(nf >= 7.0){
        printf("Aprovado!");
    }else if(nf >= 5.0 && nf <= 7.0){
        printf("Em Recuperação.");
    }else{
        printf("Reprovado.");
    }
    return 0;
}