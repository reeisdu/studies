#include <stdio.h>

// função 1
double calcularSomaDosElementos(double vet[], int n){

    double soma = 0;

    for(int i = 0; i < n; i++){
        soma += vet[i];
    }

    return soma;
}

// função 2
double calcularSomaDosElementosPositivos(double vet[], int n){

    double soma = 0;

    for(int i = 0; i < n; i++){

        if(vet[i] > 0){
            soma += vet[i];
        }

    }

    return soma;
}

int main(){

    double vetor[5] = {5, -3, 7, 2, -1};

    double somaTotal = calcularSomaDosElementos(vetor, 5);
    double somaPositivos = calcularSomaDosElementosPositivos(vetor, 5);

    printf("Soma total: %.2f\n", somaTotal);
    printf("Soma dos positivos: %.2f\n", somaPositivos);

    return 0;
}