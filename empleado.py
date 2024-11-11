class Empleado:
    def __init__(self, nombre, idemp, salarioBase):
        self._nombre = nombre
        self._idemp = idemp
        self._salarioBase = 0

    def calcularSalario(self):
        return self._salarioBase

    @property
    def nombre(self):
        return self._nombre

    @nombre.setter
    def nombre(self, Nombre):
        self._nombre = Nombre

    @property
    def idemp(self):
        return self._idemp

    @idemp.setter
    def idemp(self, Idemp):
        self._idemp = Idemp

    @property
    def salarioBase(self):
        return self._salarioBase

    @salarioBase.setter
    def salarioBase(self, Salario):
        self._salarioBase = Salario
