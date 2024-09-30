from re import X


def plano(x,y):
    if x == 0  and y == 0:
        print('El punto esta en el origen')
    elif x > 0 and y > 0:
        print('El punto esta en el cuadrante 1')
    elif x < 0 and y > 0:
        print('El punto esta en el cuadrante 2')
    elif x <  0 and y < 0:
        print('El punto esta en el cuadrante 3')
    elif x > 0 and y < 0:
        print('El punto esta en el cuadrante 4')


def menu(i):
    x = float(input('Ingresa el punto x: '))
    y = float(input('Ingresa el punto y: '))
    plano(x,y)
    i = int(input('Ingresa 0 si deseas seguir calculando coordenadas: '))
    return i

i = 0
while(i == 0):
    i = menu(i)

print('Programa terminado')

