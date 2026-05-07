#include <stdio.h>
#include <string.h>

struct Pessoa {
    int matricula;
    char nome[50];
    float nota;
};

void ordenar(struct Pessoa v[], int n, int opcao) {

    int i, j;
    struct Pessoa temp;

    for(i = 0; i < n-1; i++) {
        for(j = i+1; j < n; j++) {

            int troca = 0;

            if(opcao == 1 && v[i].matricula > v[j].matricula)
                troca = 1;

            if(opcao == 2 && strcmp(v[i].nome, v[j].nome) > 0)
                troca = 1;

            if(opcao == 3 && v[i].nota > v[j].nota)
                troca = 1;

            if(troca) {
                temp = v[i];
                v[i] = v[j];
                v[j] = temp;
            }
        }
    }
}

void imprimir(struct Pessoa v[], int n){

    for(int i = 0; i < n; i++) {
        printf("Matricula: %d\n", v[i].matricula);
        printf("Nome: %s\n", v[i].nome);
        printf("Nota: %.2f\n\n", v[i].nota);
    }

}

int main(){

    struct Pessoa alunos[3] = {
        {102, "Carlos", 7.5},
        {101, "Ana", 9.0},
        {103, "Bruno", 8.2}
    };

    int opcao;

    printf("Escolha o campo para ordenar:\n");
    printf("1 - Matricula\n");
    printf("2 - Nome\n");
    printf("3 - Nota\n");

    scanf("%d", &opcao);

    ordenar(alunos, 3, opcao);

    printf("\nLista ordenada:\n\n");

    imprimir(alunos, 3);

    return 0;
}