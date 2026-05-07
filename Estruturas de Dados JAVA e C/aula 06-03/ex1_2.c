#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main(){

    srand(time(NULL));

    for(int i = 0; i < 10; i++){

        int dado = 1 + rand() % 6;

        printf("Lancamento %d: %d\n", i+1, dado);

    }

    return 0;
}