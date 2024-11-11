from empleadostipos import ETC, EMT, EPH

def main():
    em1 = ETC("Uriel", "1024", 0)
    em2 = EMT("Fabio", "1992", 0)
    em3 = EPH("Omar", "888", tarifa_hora = 0.0, horas_trab = 0)

    em1.salarioBase = int(input("Ingrese una cifra a su consideración: "))
    em2.salarioBase = int(input("Ingrese una cifra a su consideración: "))
    em3.tarifa_hora = int(input("Ingrese una cifra a su consideración: "))
    em3.horas_trab = int(input("Ingrese la cantidad de horas deseadas: "))

    print(em1)
    print(em2)
    print(em3)

if __name__ == "__main__":
    main()