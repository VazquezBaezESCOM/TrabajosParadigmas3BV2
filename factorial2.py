def factorial(n):
    fact = 1
    if(n < 0):
        print("No hay factorial de numeros negativos")
    elif(n == 0):
        return 1
    else:
        for i in range(n,0,-1):
            fact *= i
        return fact 

                



n = int(input('Ingresa un numero entero positivo: '))
res = factorial(n)
print(res)
