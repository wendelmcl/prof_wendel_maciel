#include <stdio.h>

void inserir_valores(int lista[], int tamanho){
    int i;
    printf("Digite %d números\n", tamanho);
    for(i = 0; i < tamanho; i++){
        scanf("%d", &lista[i]);
    }
}

void imprimir_positivos(int lista[], int tamanho){
    int i;
    printf("Positivos: \n");
    for(i = 0; i < tamanho; i++){
        if(lista[i] > 0){
            printf("%d\n", lista[i]);
        }
    }
}

int main(){
    int i, lista[3];
    inserir_valores(lista, 3);
    imprimir_positivos(lista, 3);
    return 0;
}