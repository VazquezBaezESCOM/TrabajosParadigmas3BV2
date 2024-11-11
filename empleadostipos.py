from empleado import Empleado

class ETC(Empleado):
    def __init__(self, nombre, idemp, salarioBase):
        super().__init__(nombre, idemp, salarioBase)
    
    def calcularSalario(self):
        return self._salarioBase*(11/10)

    def __str__(self):
        return f"El empleado {self._nombre} cuya ID es {self._idemp} tiene un salario de {self.calcularSalario()}, de los cuales {self.calcularSalario()*(1/11)} son de bonificación por trabajo completo."


class EMT(Empleado):
    def __init__(self, nombre, idemp, salarioBase):
        super().__init__(nombre, idemp, salarioBase)
    
    def calcularSalario(self):
        return self.salarioBase/2

    def __str__(self):
        return f"El empleado {self._nombre} cuya ID es {self._idemp} tiene un salario de {self.calcularSalario()} por trabajar medio tiempo."

class EPH(Empleado):
    def __init__(self, nombre, idemp, tarifa_hora, horas_trab):
        super().__init__(nombre, idemp, salarioBase=0)
        self._tarifa_hora = 0
        self._horas_trab = 0

    @property
    def tarifa_hora(self):
        return self._tarifa_hora
    
    @tarifa_hora.setter
    def tarifa_hora(self, Tarifa):
        self._tarifa_hora = Tarifa

    @property
    def horas_trab(self):
        return self._horas_trab
    
    @horas_trab.setter
    def horas_trab(self, Horas):
        self._horas_trab = Horas

    def calcularSalario(self):
        return self.tarifa_hora * self.horas_trab

    def __str__(self):
        return f"El empleado: {self.nombre} cuya ID es {self.idemp} tiene un salario de {self.calcularSalario()} por trabajar {self.horas_trab} horas."