#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main() {
    int Objetivo, Tamano, Suma, ContaVist = 0, YaVist=0;

    printf("Introduce la cantidad de elementos que gustes dentro del arreglo: ");
    scanf("%d", &Tamano);
    
    while(Tamano<0){
    printf("Introduce una cantidad valida: ");
    scanf("%d", &Tamano); 
    }

    printf("Introduce el valor objetivo: ");
    scanf("%d", &Objetivo);
    
    while(Objetivo<0){
    printf("Introduce un valor valido: ");
    scanf("%d", &Objetivo); 
    }

    int *Arreglo = (int *)malloc(Tamano * sizeof(int));
    if (Arreglo == NULL) {
        printf("Error al asignar memoria.\n");
        return 1;
    }

    srand(time(0));

    for (int i = 0; i < Tamano; i++) {
        Arreglo[i] = rand() % 1000;
    }

    printf("Numeros aleatorios generados:\n");
    for (int i = 0; i < Tamano; i++) {
        printf("Elemento del arreglo con el indice no. %d: %d ", i, Arreglo[i]);
        printf("\n");
    }
    printf("\n");

    int **SumaVist = (int **)malloc(Tamano * sizeof(int *));
    
    printf("Indices de números que suman a %d:\n", Objetivo);
    for (int i = 0; i < Tamano; i++) {
        for (int j = i + 1; j < Tamano; j++) {
            Suma = Arreglo[i] + Arreglo[j];

            for (int k = 0; k < ContaVist; k++) {
                if ((SumaVist[k][0] == Arreglo[i] && SumaVist[k][1] == Arreglo[j]) ||
                    (SumaVist[k][0] == Arreglo[j] && SumaVist[k][1] == Arreglo[i])) {
                    YaVist = 1;
                    break;
                }
            }
            
            if (Suma == Objetivo && !YaVist) {
                printf("Indice no. %d e indice no. %d \n", i, j);
                SumaVist[ContaVist] = (int *)malloc(2 * sizeof(int));
                SumaVist[ContaVist][0] = Arreglo[i];
                SumaVist[ContaVist][1] = Arreglo[j];
                ContaVist++;
            }
        }
    }

    for (int i = 0; i < ContaVist; i++) {
        free(SumaVist[i]);
    }
    free(SumaVist);
    free(Arreglo);

    return 0;
}