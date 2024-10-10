def parentesis(a):
    j = 0
    n = len(a)
    for i in range (n-1):
        if (a[i] == '(') and (a[i+1] == ')'): 
            i = i + 1 
            j = j + 1
    return j              

a = input('Ingresa parentesis (): ')
n = parentesis(a)*2
print('Los () se repiten ', n, 'veces')



