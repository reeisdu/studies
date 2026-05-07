#include <stdio.h>
#include <string.h>

#define MAX 100

typedef struct {
    char itens[MAX];
    int topo;
} Pilha;

void init(Pilha *p) {
    p->topo = -1;
}

void push(Pilha *p, char c) {
    if (p->topo < MAX - 1) {
        p->itens[++p->topo] = c;
    }
}

char pop(Pilha *p) {
    if (p->topo >= 0) {
        return p->itens[p->topo--];
    }
    return '\0';
}

int empty(Pilha *p) {
    return p->topo == -1;
}

int main() {
    char texto[MAX];
    Pilha p;
    init(&p);

    printf("Digite um texto (terminado com ponto): ");
    fgets(texto, MAX, stdin);

    for (int i = 0; texto[i] != '\0'; i++) {
        if (texto[i] != ' ' && texto[i] != '.') {
            push(&p, texto[i]);
        } else {
            while (!empty(&p)) {
                printf("%c", pop(&p));
            }
            printf("%c", texto[i]);
        }

        if (texto[i] == '.') break;
    }

    return 0;
}