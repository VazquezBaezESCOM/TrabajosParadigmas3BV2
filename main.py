from biblioteca import Biblioteca

def main():
    mi_biblioteca = Biblioteca()

    while True:
        print("\n--- Menú de Biblioteca ---")
        print("1. Agregar un libro")
        print("2. Mostrar todos los libros")
        print("3. Buscar un libro por ISBN")
        print("4. Prestar un libro")
        print("5. Regresar un libro")
        print("6. Salir")

        opcion = input("Seleccione una opción: ")

        if opcion == '1':
            titulo = input("Ingrese el título del libro: ")
            autor = input("Ingrese el autor del libro: ")
            isbn = input("Ingrese el ISBN del libro: ")
            mi_biblioteca.agregar_libro(titulo, autor, isbn)

        elif opcion == '2':
            mi_biblioteca.mostrar_libros()

        elif opcion == '3':
            isbn = input("Ingrese el ISBN del libro a buscar: ")
            libro = mi_biblioteca.buscar_libro(isbn)
            if libro:
                print("\nLibro encontrado:")
                print(libro) 
            else:
                print("No se encontró ningún libro con ese ISBN.")

        elif opcion == '4':
            isbn = input("Ingrese el ISBN del libro a prestar: ")
            mi_biblioteca.prestar_libro(isbn)

        elif opcion == '5':
            isbn = input("Ingrese el ISBN del libro a regresar: ")
            mi_biblioteca.regresar_libro(isbn)

        elif opcion == '6':
            print("Saliendo del programa.")
            break

        else:
            print("Opción inválida. Por favor, seleccione una opción válida.")

if __name__ == "__main__":
    main()
