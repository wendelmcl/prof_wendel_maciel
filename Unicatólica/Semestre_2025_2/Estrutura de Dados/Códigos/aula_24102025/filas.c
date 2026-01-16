#include <stdio.h>
#include <stdlib.h>

#define TAMANHO 5

typedef struct{
    int itens[TAMANHO];
    int inicio;
    int fim;
}Fila;

void iniciarFila(Fila *f){
    f->inicio = 0;
    f->fim = 0;
}

int estaVazia(Fila *f){
    return (f->inicio == f->fim);
}

int estaCheia(Fila *f){
    return(f->fim == TAMANHO);
}

void enfileirar(Fila *f, int valor){
    if(estaCheia(f)){
        printf("ERRO: Fila esta cheia\n");
        return;
    }
    f->itens[f->fim] = valor;
    f->fim++;
    printf("Enfileirado: %d\n", valor);
}

int desenfileirar(Fila *f){
    if(estaVazia(f)){
        printf("Fila vazia\n");
        return -1;
    }
    
    int valorRemovido = f->itens[f->inicio];
    f->inicio++;
    
    if(f->inicio == f->fim){
        printf("Fila esvaziada\n");
        iniciarFila(f);
    }
    return valorRemovido;
}


int main()
{
    Fila fila;
    int valorRemovido;
    
    iniciarFila(&fila);
    printf("Enfileirar\n");
    enfileirar(&fila, 10);
    enfileirar(&fila, 20);
    enfileirar(&fila, 30);
    
    printf("Desenfileirar\n");
    valorRemovido = desenfileirar(&fila);
    if(valorRemovido != -1){
        printf("Valor desenfileirado: %d\n", valorRemovido);
    }
    valorRemovido = desenfileirar(&fila);
    if(valorRemovido != -1){
        printf("Valor desenfileirado: %d\n", valorRemovido);
    }
    
    printf("Enfileirando novos itens\n");
    enfileirar(&fila, 40);
    enfileirar(&fila, 50);
    enfileirar(&fila, 60);
    enfileirar(&fila, 70);
    
    printf("Esvaziando a fila\n");
    while(!estaVazia(&fila)){
        valorRemovido = desenfileirar(&fila);
        if(valorRemovido != -1){
            printf("Valor desenfileirado: %d\n", valorRemovido);
        }
    }
    
    printf("Remover de fila vazia\n");
    desenfileirar(&fila);

    return 0;
}