#include <stdio.h>
#include <stdlib.h>

typedef struct No {
    int valor;
    struct No *esquerda;
    struct No *direita;
} No;

No* criarNo(int valor) {
    No *novoNo = (No*) malloc(sizeof(No));
    
    if (novoNo == NULL) {
        printf("Erro ao alocar memória!\n");
        exit(1);
    }
    
    novoNo->valor = valor;
    novoNo->esquerda = NULL;
    novoNo->direita = NULL;
    
    return novoNo;
}

No* inserir(No* raiz, int valor) {

    if (raiz == NULL) {
        return criarNo(valor);
    }
    
    if (valor < raiz->valor) {
        raiz->esquerda = inserir(raiz->esquerda, valor);
    } else {
        raiz->direita = inserir(raiz->direita, valor);
    }
    
    return raiz;
}

void imprimirEmOrdem(No* raiz) {
    if (raiz == NULL) {
        return;
    }
    
    imprimirEmOrdem(raiz->esquerda);
    
    printf("%d ", raiz->valor);
    
    imprimirEmOrdem(raiz->direita);
}

void liberarArvore(No* raiz) {
    if (raiz == NULL) {
        return;
    }
    
    liberarArvore(raiz->esquerda);
    liberarArvore(raiz->direita);
    
    free(raiz);
}

int main() {
    No *raiz = NULL; 

    printf("Inserindo valores na árvore...\n");
    
    raiz = inserir(raiz, 50);
    raiz = inserir(raiz, 30);
    raiz = inserir(raiz, 70);
    raiz = inserir(raiz, 20);
    raiz = inserir(raiz, 40);
    raiz = inserir(raiz, 60);
    raiz = inserir(raiz, 80);

    printf("\nValores ordenados: \n");
    imprimirEmOrdem(raiz);
    printf("\n");

    printf("\nLiberando memória da árvore...\n");
    liberarArvore(raiz);
    raiz = NULL;

    return 0;
}