# Definición de variables
Dividendo = int(input('Digite un número para el dividendo: '))
Divisor = int(input('Digite un número para el divisor: '))
Cociente=0
# Verificación de los datos
if Divisor == 0:
    while Divisor == 0:
        Divisor = int(input('Digite un número para el divisor: '))
elif Divisor < 0:
    while Divisor < 0:
        Divisor = int(input('Digite un número para el divisor: '))
# Asignación del valor del residuo
Residuo=Dividendo
print('El valor del cociente es igual a', Cociente)
print('El valor del residuo es igual a', Residuo)
print(f'Por lo tanto, la representación del algoritmo de la división para este caso es: {Dividendo} = {Divisor}({Cociente}) + {Residuo}')
# Divisiones mediante restas sucesivas
if Dividendo<0:
    while Residuo<= -Divisor:
        Residuo = Residuo + Divisor
        Cociente=Cociente-1
        print('El valor del cociente es igual a', Cociente)
        print('El valor del residuo es igual a', Residuo)
        print(f'Por lo tanto, la representación del algoritmo de la división para este caso es: {Dividendo} = {Divisor}({Cociente}) + {Residuo}')

else:
    while Residuo>=Divisor:
        Residuo = Residuo - Divisor
        Cociente=Cociente+1
        print('El valor del cociente es igual a', Cociente)
        print('El valor del residuo es igual a', Residuo)
        print(f'Por lo tanto, la representación del algoritmo de la división para este caso es: {Dividendo} = {Divisor}({Cociente}) + {Residuo}')