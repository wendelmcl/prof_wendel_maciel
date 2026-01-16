#include <stdio.h>
#include <stdlib.h>

#define TAMANHO 5

typedef struct {
    int elementos[TAMANHO];
    int topo;
}Pilha;

void inicializarPilha(Pilha *p){
    p->topo = -1;
    printf("Pilha inicializada. \n");
}

int estaVazia(Pilha *p){
    return (p->topo == -1);
}

int estaCheia(Pilha *p){
    return(p->topo >= TAMANHO);
}

void empilhar(Pilha *p, int valor){
    if(estaCheia(p)){
        printf("Não foi possível adicionar o elemento.\n");
    }else{
        p->topo++;
        p->elementos[p->topo] = valor;
        printf("Empilhado: %d | Topo da pilha em: %d\n", valor, p->topo);
    }
}

int desempilhar(Pilha *p){
    if(estaVazia(p)){
        printf("Pilha vazia.\n");
        return -1;
    }
    int valorRemovido = p->elementos[p->topo];
    p->topo--;
    return valorRemovido;
}


int main(){
    
    Pilha minhaPilha;
    int valorRemovido = 0;
    
    inicializarPilha(&minhaPilha);
    printf(" \n--- Empilhando os elementos ---\n");
    empilhar(&minhaPilha, 10);
    empilhar(&minhaPilha, 20);
    empilhar(&minhaPilha, 30);
    
    printf("\n --- Desempilhando elementos --- \n");
    valorRemovido = desempilhar(&minhaPilha);
    if(valorRemovido != -1){
        printf("Valor desempilhado: %d\n", valorRemovido);
    }
    printf(" \n--- Empilhando mais um elemento ---\n");
    empilhar(&minhaPilha, 40);
    
    printf("\n--- Esvaziando a pilha ---\n");
    valorRemovido = desempilhar(&minhaPilha);
    if(valorRemovido != -1){
        printf("Valor desempilhado: %d\n", valorRemovido);
    }
    valorRemovido = desempilhar(&minhaPilha);
    if(valorRemovido != -1){
        printf("Valor desempilhado: %d\n", valorRemovido);
    }
    desempilhar(&minhaPilha);
    printf(" \n--- Empilhar novos elementos --- \n");
    empilhar(&minhaPilha, 1);
    empilhar(&minhaPilha, 2);
    empilhar(&minhaPilha, 3);
    empilhar(&minhaPilha, 4);
    empilhar(&minhaPilha, 5);
    empilhar(&minhaPilha, 6);
    empilhar(&minhaPilha, 7);
    return 0;
}