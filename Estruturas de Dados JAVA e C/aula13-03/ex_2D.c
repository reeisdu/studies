#include <stdio.h>

int main() {

    int vetor[5] = {1, 2, 3, 4, 5};
    int ordenado = 1;

    for(int i = 0; i < 4; i++) {

        if(vetor[i] > vetor[i+1]) {
            ordenado = 0;
            break;
        }

    }

    if(ordenado == 1)
        printf("ORDENADO\n");
    else
        printf("NAO ORDENADO\n");

    return 0;
}