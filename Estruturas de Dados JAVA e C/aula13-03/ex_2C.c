#include <stdio.h>

int main() {

    int precos[5] = {3500, 40, 900, 120, 500};
    int menor = precos[0];

    for(int i = 1; i < 5; i++) {

        if(precos[i] < menor) {
            menor = precos[i];
        }

    }

    printf("Menor preco: %d\n", menor);

    return 0;
}