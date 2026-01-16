#include <stdio.h>
#include <stdlib.h>
struct celula{
    int valor;
    struct celula *proximo;
};

void inserirElementos(struct celula** head, int valor){
   struct celula *novoNo = (struct celula*)malloc(sizeof(struct celula));
    novoNo->valor = valor;
    novoNo->proximo = NULL;
    if(*head == NULL){
        *head = novoNo;
        return;
    }
    
    struct celula* temp = *head;
    while(temp->proximo != NULL){
        temp = temp->proximo;
    }
    temp->proximo = novoNo;
}

void imprimirLista(struct celula* head){
    struct celula* temp = head;
    printf("Elementos da lista: ");
    while(temp != NULL){
        printf("%d -> ", temp->valor);
        temp = temp->proximo;
    }
    printf("\n");
}

int main() {
    struct celula* head = NULL;
    inserirElementos(&head, 10);
    inserirElementos(&head, 20);
    inserirElementos(&head, 30);
    inserirElementos(&head, 40);
    
    imprimirLista(head);

    return 0;
}