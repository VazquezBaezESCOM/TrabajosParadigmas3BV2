def pago(hsalario, horas, nombre, apellido): 
    if(horas <= 40 ):
        print('El salario de ', nombre, ' ', apellido,  'es de: ', horas * hsalario )
    else:
        extra = (horas - 40 ) * (hsalario * 1.5)
        salf = (40 * hsalario) + extra 
        print('El salario de ', nombre, ' ', apellido, 'es de: ', salf)
        


def menu(i):
    nombre = input('Ingresa el nombre del trabajador: ')
    apellido = input ('Ingresa el apellido del trabajador: ')
    hsalario = int(input('Ingresa el pago por hora del trabajador: '))
    hora = int(input('Ingresa las horas trabajadas: '))
    pago(hsalario, hora, nombre, apellido)
    i = int(input('Si desea ingresar otro trabajador presione 0: '))
    return 1

      

i = 0 
while(i == 0):
    i = menu(i)    
