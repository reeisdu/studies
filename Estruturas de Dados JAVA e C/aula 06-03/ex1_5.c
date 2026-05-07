#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main(){

    int numeros[6];
    int repetido;

    srand(time(NULL));

    for(int i = 0; i < 6; i++){

        do{

            repetido = 0;

            numeros[i] = 1 + rand() % 60;

            for(int j = 0; j < i; j++){

                if(numeros[i] == numeros[j]){
                    repetido = 1;
                }

            }

        }while(repetido);

    }

    for(int i = 0; i < 6; i++){
        printf("%d ", numeros[i]);
    }

    return 0;
}