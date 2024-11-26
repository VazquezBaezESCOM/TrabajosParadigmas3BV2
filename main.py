#made by fabs, uriel and omar

# Importación de la clase CuentaBancaria y las excepciones personalizadas desde el archivo cuenta_bancaria.py
from cuenta_bancaria import CuentaBancaria, DepositoInvalidoException, RetiroInvalidoException, FondosInsuficientesException

# Función principal que implementa un menú interactivo para realizar operaciones bancarias.
def main():
    """
    Función principal para ejecutar el sistema bancario.
    Permite realizar operaciones de depósito, retiro y consulta de saldo.
    Maneja excepciones personalizadas y valida entradas del usuario.
    """
    print("Bienvenido al sistema de gestión de transacciones bancarias.")  # Mensaje de bienvenida.
    # Solicita al usuario el número de cuenta y saldo inicial.
    numeroCuenta = input("Ingrese el número de cuenta: ")
    saldoInicial = float(input("Ingrese el saldo inicial: "))
    # Crea una instancia de CuentaBancaria con los datos proporcionados por el usuario.
    cuenta = CuentaBancaria(numeroCuenta, saldoInicial)

    while True:
        # Muestra un menú de opciones al usuario.
        print("\n--- Operaciones Bancarias ---")
        print("1. Depositar dinero")
        print("2. Retirar dinero")
        print("3. Consultar saldo")
        print("4. Salir")
        opcion = input("Seleccione una opción: ")

        try:
            if opcion == "1":
                # Opción para depositar dinero.
                cantidad = float(input("Ingrese la cantidad a depositar: "))
                cuenta.depositar(cantidad)  # Llama al método depositar.
                print(f"Depósito exitoso. Saldo actual: {cuenta.saldo:.2f}")  # Muestra el saldo actualizado.
            elif opcion == "2":
                # Opción para retirar dinero.
                cantidad = float(input("Ingrese la cantidad a retirar: "))
                cuenta.retirar(cantidad)  # Llama al método retirar.
                print(f"Retiro exitoso. Saldo actual: {cuenta.saldo:.2f}")  # Muestra el saldo actualizado.
            elif opcion == "3":
                # Opción para consultar el saldo actual.
                print(f"Saldo actual: {cuenta.saldo:.2f}")  # Muestra el saldo sin cambios.
            elif opcion == "4":
                # Opción para salir del programa.
                print("Gracias por usar el sistema. Hasta luego.")  # Mensaje de despedida.
                break  # Finaliza el bucle y cierra el programa.
            else:
                # Manejo de opción inválida en el menú.
                print("Opción inválida. Intente de nuevo.")
        except DepositoInvalidoException as e:
            # Captura y muestra el error si se intenta depositar un monto negativo.
            print(f"Error: {e}")
        except RetiroInvalidoException as e:
            # Captura y muestra el error si se intenta retirar un monto negativo.
            print(f"Error: {e}")
        except FondosInsuficientesException as e:
            # Captura y muestra el error si se intenta retirar más del saldo disponible.
            print(f"Error: {e}")
        except ValueError:
            # Captura errores de conversión de entrada inválida (por ejemplo, texto en lugar de números).
            print("Error: Entrada inválida. Ingrese un número válido.")

# Punto de entrada del programa.
if __name__ == "__main__":
    main()  # Llama a la función principal.
