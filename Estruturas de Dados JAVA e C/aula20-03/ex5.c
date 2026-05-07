#include <stdio.h>

#define MAX 100

typedef struct {
    int itens[MAX];
    int topo;
} Pilha;

int contarPares(Pilha *p) {
    int count = 0;
    for (int i = 0; i <= p->topo; i++) {
        if (p->itens[i] % 2 == 0) {
            count++;
        }
    }
    return count;
}

int contarImpares(Pilha *p) {
    int count = 0;
    for (int i = 0; i <= p->topo; i++) {
        if (p->itens[i] % 2 != 0) {
            count++;
        }
    }
    return count;
}