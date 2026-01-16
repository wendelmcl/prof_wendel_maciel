#include <stdio.h>
int buscar(int vetor[], int tamanho, int valor){
    for(int i = 0; i < tamanho; i++){
        if(vetor[i] == valor){
            return i;
        }
    }
    return -1;
}

int main()
{
    int vetor[6], numero = 0, posicao = 0;
    for(int i = 0; i < 6; i++){
        printf("Digite um valor [%d]: ",i);
        scanf("%d", &numero);
        vetor[i] = numero;
    }
    
    posicao = buscar(vetor, 6, 100);
    printf("Posição: [%d] ", posicao);

    return 0;
}