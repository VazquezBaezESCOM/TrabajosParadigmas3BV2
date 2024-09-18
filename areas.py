from math import pi
import math

def circulo(r): 
    area = pi * ((r*100)**2)
    perimetro = 2*pi*r
    return area, perimetro
    
def triangulo(l1,l2,l3):
    if((l1 <l2 + l3 ) and (l2 < l1 + l3 ) and (l3 < l1 + l2 )):
        perimetro = (100*l1) + (l2*100) + (l3*100)
        s = perimetro / 2
        area = math.sqrt((s-(l1*100))*(s-(l2*100))*(s-(l3*100)))
        return area, perimetro
    else:
        return None, None

def cuadrado(l):
    return (l*100)**2, 400*l


def rectangulo(b,h):
    return (100*b) * (100*h),  200*(b+h)

def romboide(a,b,h):
    return (b*100)*(h*100), 2*((100*a) + (b*100))


def menu():
    print('1.Circulo')
    print('2.Rectangulo')
    print('3.Cuadrado')
    print('4.Triangulo')
    print('5.Romboide')
    print('6.Salir')
    i =int(input('Ingresa una opcion: '))
    return i

a = 0
while(a !=6):
    a = menu()
    if a == 1: 
        r = int(input(('Ingresa el radio del circulo: ')))
        area, perimetro = circulo(r)
        print('El area es:', area, '')
        print('El perimetro es: ',perimetro, ' en cm cuadrados')
    if a == 2: 
        b = int(input('Ingresa la base: '))
        h = int(input('Ingresa la altura: '))
        area, perimetro = rectangulo(b,h)
        print('El area del rectangulo es: ', area, ' en cm cuadrados')
        print('El perimetro del rectangulo es: ', perimetro ,' en cm cuadrados')
    if a == 3:
        l = int(input('Ingresa el lado del cuadrado: '))
        area , perimetro = cuadrado(l);
        print('El area del cuadrado es: ', area, ' en cm cuadrados')
        print('El perimetro del cuadrado es: ', perimetro, ' en cm cuadrados')
    if a == 4: 
        l1 = int(input('Ingresa el lado 1 del triangulo: '))
        l2 = int(input('Ingresa el lado 2 del triangulo: '))       
        l3 = int(input('Ingresa el lado 3 del triangulo: ')) 
        area, perimetro = triangulo(l1,l2,l3)
        print('El area del triangulo es: ', area, ' en cm cuadrados')
        print('El perimetro del triangulo es: ', perimetro, ' en cm cuadrados')
    if a == 5:
        a = int(input('Ingresa el lado a del romboide:'))
        b= int(input('Ingresa la base del romboide: '))
        h = int(input('Ingresa la altura del romboide:'))
        area, perimetro = romboide(a,b,h)
        print('El area del romboide es: ', area, ' en cm cuadrados')
        print('El perimetro del romboide es: ', perimetro, ' en cm cuadrados')
    if a == 6:
        print('Programa finalizado.')

