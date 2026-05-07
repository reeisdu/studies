#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main(){

    int segredo, chute;

    srand(time(NULL));

    segredo = 1 + rand() % 50;

    do{

        printf("Digite um numero: ");
        scanf("%d", &chute);

        if(chute > segredo){
            printf("Muito alto\n");
        }
        else if(chute < segredo){
            printf("Muito baixo\n");
        }
        else{
            printf("Acertou!\n");
        }

    }while(chute != segredo);

    return 0;
}