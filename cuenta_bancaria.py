# Definición de excepciones 

class DepositoInvalidoException(Exception):
    """Excepción lanzada cuando el monto a depositar es negativo."""
    pass

class RetiroInvalidoException(Exception):
    """Excepción lanzada cuando el monto a retirar es negativo."""
    pass

class FondosInsuficientesException(Exception):
    """Excepción lanzada cuando el monto a retirar excede el saldo disponible."""
    pass

# Clase principal que representa una cuenta bancaria con métodos para realizar operaciones como depositar y retirar.
class CuentaBancaria:
    def __init__(self, numeroCuenta, saldoInicial=0.0):
        """
        Constructor de la clase.
        :param numeroCuenta: Número único que identifica la cuenta bancaria (tipo string).
        :param saldoInicial: Saldo inicial de la cuenta bancaria (por defecto es 0.0).
        """
        self.numeroCuenta = numeroCuenta  # Asigna el número de cuenta.
        self.saldo = saldoInicial  # Inicializa el saldo de la cuenta.

    def depositar(self, cantidad):
        """
        Método para depositar dinero en la cuenta.
        :param cantidad: Monto a depositar.
        :raises DepositoInvalidoException: Si el monto es negativo.
        """
        if cantidad < 0:
            # Si la cantidad es negativa, lanza una excepción personalizada.
            raise DepositoInvalidoException("El monto a depositar no puede ser negativo.")
        self.saldo += cantidad  # Agrega la cantidad al saldo actual.

    def retirar(self, cantidad):
        """
        Método para retirar dinero de la cuenta.
        :param cantidad: Monto a retirar.
        :raises RetiroInvalidoException: Si el monto es negativo.
        :raises FondosInsuficientesException: Si el monto es mayor al saldo disponible.
        """
        if cantidad < 0:
            # Si la cantidad es negativa, lanza una excepción personalizada.
            raise RetiroInvalidoException("El monto a retirar no puede ser negativo.")
        if cantidad > self.saldo:
            # Si la cantidad excede el saldo disponible, lanza una excepción personalizada.
            raise FondosInsuficientesException("Saldo insuficiente para realizar el retiro.")
        self.saldo -= cantidad  # Reduce el saldo por el monto retirado.


#made by fabs, uriel and omar