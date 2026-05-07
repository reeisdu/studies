#include <stdio.h>

int main(){

    int v[10];
    int x;
    int encontrado = -1;

    printf("Digite 10 numeros ordenados:\n");

    for(int i = 0; i < 10; i++){

        scanf("%d", &v[i]);

    }

    printf("Digite o numero que deseja buscar: ");
    scanf("%d", &x);

    for(int i = 0; i < 10; i++){

        if(v[i] == x){

            encontrado = i;
            break;

        }

        if(v[i] > x){

            break;

        }

    }

    if(encontrado != -1)
        printf("Numero encontrado na posicao %d\n", encontrado);
    else
        printf("Numero nao encontrado\n");

    return 0;
}