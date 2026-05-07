#include <stdio.h>
#include <string.h>

void ordenar(char v[][20], int n){

    int i,j;
    char temp[20];

    for(i=0;i<n-1;i++){

        for(j=i+1;j<n;j++){

            if(strcmp(v[i], v[j]) > 0){

                strcpy(temp, v[i]);
                strcpy(v[i], v[j]);
                strcpy(v[j], temp);

            }
        }
    }
}

int main(){

    char paises[6][20] = {"Mexico","Brasil","Cuba","Chile","Argentina","Espanha"};

    ordenar(paises,6);

    for(int i=0;i<6;i++)
        printf("%s\n",paises[i]);

}