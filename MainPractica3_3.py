Exponente = 0
i = 1

Objetivo = int(input('Digite un numero a elegir como objetivo: '))

if Objetivo < 1:
    while Objetivo < 1:
        Objetivo = int(input('Digite un numero mayor a 1 '))
        
while i<Objetivo :
    Exponente = Exponente+1
    i = 2**Exponente
    
if i == Objetivo:
    print (f'El numero que mas se acerca a el objetivo "{Objetivo}" es {i} que es igual a 2 elevado a la {Exponente}, ya que {Objetivo} es igual a {i}')    

else:
    Exponente = Exponente-1
    i = 2**Exponente
    print (f'El numero que mas se acerca a el objetivo "{Objetivo}" es {i} que es igual a 2 elevado a la {Exponente}')