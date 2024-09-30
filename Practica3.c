#include <stdio.h>

// Prototipos de las funciones
int atoi(const char *str, int *error);
void igespacio(char *str);
int valnumero(const char *str);
int longitud(const char *str);

int main() {
    char str[100];
    int error = 0; // Variable para almacenar si ocurrió algún error

    // Solicitar al usuario que ingrese una cadena de caracteres numéricos
    printf("Ingresa una cadena de caracteres numéricos: ");
    fgets(str, sizeof(str), stdin);

    // Eliminar el salto de línea final que fgets captura manualmente
    int len = longitud(str);
    if (str[len - 1] == '\n') {
        str[len - 1] = '\0';
    }

    // Eliminar espacios en blanco al principio y al final
    igespacio(str);

    // Validar si la cadena contiene solo números
    if (!valnumero(str)) {
        printf("Error: La cadena contiene caracteres no numéricos.\n");
        return 1;
    }

    // Convertir la cadena a entero utilizando la función personalizada atoi
    int num = atoi(str, &error);

    // Manejar posibles errores de conversión
    if (error) {
        printf("Error: No se pudo convertir la cadena a un número válido.\n");
        return 1;
    }

    // Mostrar el número convertido
    printf("El número convertido es: %d\n", num);

    return 0;
}

// Función personalizada para convertir una cadena de caracteres numéricos a un entero
int atoi(const char *str, int *error) {
    int result = 0; // Resultado inicial
    int sign = 1;   // Signo por defecto positivo
    *error = 0;     // Inicializar error en 0 (sin errores)

    // Ignorar espacios iniciales (aunque ya han sido eliminados en main)
    while (*str == ' ') {
        str++;
    }

    // Verificar si el primer carácter es un signo negativo o positivo
    if (*str == '-') {
        sign = -1;  // Cambiar el signo a negativo
        str++;      // Avanzar el puntero para ignorar el signo
    } else if (*str == '+') {
        str++;      // Avanzar si es positivo explícito
    }

    // Recorrer la cadena mientras haya caracteres numéricos
    while (*str != '\0') {
        if (*str < '0' || *str > '9') {
            *error = 1; // Si encontramos un carácter no numérico, marcamos un error
            return 0;
        }
        result = result * 10 + (*str - '0'); // Convertir carácter a número y acumular
        str++;  // Avanzar al siguiente carácter
    }

    return result * sign;  // Devolver el resultado ajustado por el signo
}

// Función para eliminar espacios en blanco al principio y al final de una cadena
void igespacio(char *str) {
    // Eliminar espacios al inicio
    char *start = str;
    while (*start == ' ' || *start == '\t' || *start == '\n') {
        start++;
    }

    // Mover la cadena hacia el inicio si tenía espacios
    if (start != str) {
        char *temp = str;
        while (*start != '\0') {
            *temp++ = *start++;
        }
        *temp = '\0';
    }

    // Eliminar espacios al final
    char *end = str;
    while (*end != '\0') {
        end++;
    }
    end--; // Ir al último carácter válido

    while (end > str && (*end == ' ' || *end == '\t' || *end == '\n')) {
        *end-- = '\0';
    }
}

// Función para validar si una cadena contiene solo caracteres numéricos
int valnumero(const char *str) {
    // Si la cadena está vacía, no es válida
    if (*str == '\0') {
        return 0;
    }

    // Ignorar el primer carácter si es un signo '+' o '-'
    if (*str == '-' || *str == '+') {
        str++;
    }

    // Verificar si cada carácter es numérico
    while (*str != '\0') {
        if (*str < '0' || *str > '9') {
            return 0; // Retornar 0 si se encuentra un carácter no numérico
        }
        str++;
    }

    return 1; // Si todos los caracteres son numéricos, retornar 1
}

// Función para calcular la longitud de una cadena
int longitud(const char *str) {
    int len = 0;
    while (*str != '\0') {
        len++;
        str++;
    }
    return len;
}