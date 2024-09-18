#include<stdio.h>
#include<stdbool.h>

//elaborado por Fabs, Omar, uriel
//prototipos de funciones
bool es_palindromo(int x);
void limpiar_buffer(void);

//función principal

int main() {
    int numero;
    char c;

    // Solicitar entrada al usuario
    printf("Introduce un numero: ");
    
    // Depurar el buffer para prevenir problemas de entrada
    if (scanf("%d", &numero) != 1) {  // Verifica si la entrada es correcta
        limpiar_buffer();  // Llama a la función que limpia el buffer
        printf("Entrada invalida. Por favor, introduce un numero entero.\n");
        return 1;  // Termina el programa si la entrada no es valida
    }

    // Verificar si el número es palíndromo
    if (es_palindromo(numero)) {
        printf("El numero %d es un palindromo.\n", numero);
    } else {
        printf("El numero %d no es un palindromo.\n", numero);
    }

    return 0;
}


//resto de funciones

// Definición de la función que verifica si un número es palíndromo
bool es_palindromo(int x) {
    int numero_original = x;  // Guardamos el número original
    int reverso = 0;
    int residuo;

    // Invertir el número
    while (x != 0) {
        residuo = x % 10;
        reverso = reverso * 10 + residuo;
        x /= 10;
    }

    // Si el número original es igual al número invertido, es palíndromo
    return (numero_original == reverso);
}

// Definición de la función para limpiar el buffer
void limpiar_buffer(void) {
    char c;
    while ((c = getchar()) != '\n' && c != EOF);  // Limpiar el buffer
}