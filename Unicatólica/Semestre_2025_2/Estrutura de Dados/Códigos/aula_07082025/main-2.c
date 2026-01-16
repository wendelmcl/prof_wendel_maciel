#include <stdio.h>

int main()
{
    int n1 = 10, n2 = 50;
    
    if(n1 > n2){
        printf("O número %d é maior que o número %d", n1, n2);
    }else{
        printf("O número %d é maior que o número %d", n2, n1);
    }
    
    return 0;
}