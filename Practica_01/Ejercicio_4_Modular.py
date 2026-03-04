import math

def promedio(numeros):
    suma = 0
    for n in numeros:
        suma += n
    return suma / len(numeros)

def desviacion(numeros):
    prom = promedio(numeros)
    suma = 0
    for n in numeros:
        suma += (n - prom) ** 2
    return math.sqrt(suma / (len(numeros) - 1))
print("Ingrese 10 números:")
numeros = []
for i in range(10):
    num = float(input())
    numeros.append(num)

print("El promedio es", round(promedio(numeros), 2))
print("La desviación estándar es", round(desviacion(numeros), 5))
