import math

class Estadistica:

    def __init__(self, numeros):
        self.numeros = numeros

    def promedio(self):
        suma = 0
        for n in self.numeros:
            suma += n
        return suma / len(self.numeros)

    def desviacion(self):
        prom = self.promedio()
        suma = 0
        for n in self.numeros:
            suma += (n - prom) ** 2
        return math.sqrt(suma / (len(self.numeros) - 1))
print("Ingrese 10 números:")

numeros = []
for i in range(10):
    num = float(input())
    numeros.append(num)

estadistica = Estadistica(numeros)

print("El promedio es", round(estadistica.promedio(), 2))
print("La desviación estándar es", round(estadistica.desviacion(), 5))
