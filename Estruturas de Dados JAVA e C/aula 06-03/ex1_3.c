#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main(){

    int v[10];
    int maior;

    srand(time(NULL));

    for(int i = 0; i < 10; i++){

        v[i] = rand() % 101;

        printf("%d ", v[i]);

    }

    maior = v[0];

    for(int i = 1; i < 10; i++){

        if(v[i] > maior){
            maior = v[i];
        }

    }

    printf("\nMaior valor: %d", maior);

    return 0;
}