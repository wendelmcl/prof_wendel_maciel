#include <stdio.h>

int main(){
    int i, lista[3];
    printf("Digite 3 números: \n");
    for(i = 0; i < 3; i++){
        scanf("%d", &lista[i]);
    }
    printf("Positivos: \n");
    for(i = 0; i < 3; i++){
        if(lista[i] > 0){
            printf("%d\n", lista[i]);
        }
    }
    
    return 0;
}