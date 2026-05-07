#include <stdio.h>

int main(){

    int v[10];
    int x;
    int encontrado = -1;

    for(int i = 0; i < 10; i++){

        printf("Digite numero: ");
        scanf("%d", &v[i]);

    }

    printf("Numero a buscar: ");
    scanf("%d", &x);

    for(int i = 0; i < 10; i++){

        if(v[i] == x){

            encontrado = i;
            break;

        }

    }

    if(encontrado != -1)
        printf("Encontrado na posicao %d", encontrado);
    else
        printf("Nao encontrado");

    return 0;
}