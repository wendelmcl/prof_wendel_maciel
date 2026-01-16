#include <stdio.h>
void le_vetor(int vetor[], int tamanho){
    printf("Digite os elementos: \n");
    for(int i = 0; i < tamanho; i++){
        scanf("%d", &vetor[i]);
    }
}


int somatorio(int vetor[], int tamanho){
    int soma = 0;
    for(int i = 0; i < tamanho; i++){
        soma = soma + vetor[i];
    }
    return soma;
}

int main()
{
    int vetor[4];
    le_vetor(vetor, 4);
    printf("O somatorio do vetor é: %d", somatorio(vetor, 4));

    return 0;
}