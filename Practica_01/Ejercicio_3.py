import math
class EcuacionCuadratica:
    def __init__(self, a, b, c):
        self.a = a
        self.b = b
        self.c = c

    def getDiscriminante(self):
        return self.b**2 - 4*self.a*self.c

    def getRaiz1(self):
        d = self.getDiscriminante()
        if d >= 0:
            return (-self.b + math.sqrt(d)) / (2*self.a)
        else:
            return 0

    def getRaiz2(self):
        d = self.getDiscriminante()
        if d >= 0:
            return (-self.b - math.sqrt(d)) / (2*self.a)
        else:
            return 0


print("Ingrese a, b, c:")
a = float(input("a: "))
b = float(input("b: "))
c = float(input("c: "))

ecuacion = EcuacionCuadratica(a, b, c)

discriminante = ecuacion.getDiscriminante()

if discriminante > 0:
    print("La ecuación tiene dos raíces",
          ecuacion.getRaiz1(), "y", ecuacion.getRaiz2())

elif discriminante == 0:
    print("La ecuación tiene una raíz",
          ecuacion.getRaiz1())

else:
    print("La ecuación no tiene raíces reales")
