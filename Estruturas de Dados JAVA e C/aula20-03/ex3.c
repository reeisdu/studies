#include <stdio.h>

#define MAX 10

typedef struct {
    int itens[MAX];
    int topo;
} Pilha;

void init(Pilha *p) {
    p->topo = -1;
}

void push(Pilha *p, int valor) {
    if (p->topo < MAX - 1) {
        p->itens[++p->topo] = valor;
    }
}

int pop(Pilha *p) {
    if (p->topo >= 0) {
        return p->itens[p->topo--];
    }
    return -1;
}

void printPilha(Pilha *p) {
    for (int i = 0; i <= p->topo; i++) {
        printf("%d ", p->itens[i]);
    }
    printf("\n");
}

int main() {
    Pilha p, aux;
    init(&p);
    init(&aux);

    // Pilha inicial: 1, 2, 3, 4
    push(&p, 1);
    push(&p, 2);
    push(&p, 3);
    push(&p, 4);

    int a, b, c, d;

    // E E E E (desempilha tudo)
    a = pop(&p); // 4
    b = pop(&p); // 3
    c = pop(&p); // 2
    d = pop(&p); // 1

    // I I I I (nova ordem desejada: 2 4 3 1)
    push(&aux, c); // 2
    push(&aux, a); // 4
    push(&aux, b); // 3
    push(&aux, d); // 1

    printf("Resultado final da pilha:\n");
    printPilha(&aux);

    return 0;
}