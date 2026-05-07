#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main(){

    int v[20];
    int numero;
    int cont = 0;

    srand(time(NULL));

    for(int i = 0; i < 20; i++){

        v[i] = 1 + rand() % 10;
        printf("%d ", v[i]);

    }

    printf("\nNumero para buscar: ");
    scanf("%d", &numero);

    for(int i = 0; i < 20; i++){

        if(v[i] == numero){
            cont++;
        }

    }

    printf("Aparece %d vezes", cont);

    return 0;
}