from libro import Libro

class Biblioteca:
    def __init__(self):
        self.libros = []

    def agregar_libro(self, titulo, autor, isbn):
        nuevo_libro = Libro()
        nuevo_libro.titulo = titulo
        nuevo_libro.autor = autor
        nuevo_libro.isbn = isbn
        self.libros.append(nuevo_libro)
        print(f"Libro agregado: {titulo}")

    def mostrar_libros(self):
        if not self.libros:
            print("La biblioteca está vacía.")
        else:
            print("\nLista de libros en la biblioteca:")
            for libro in self.libros:
                print(f"Título: {libro.titulo}, Autor: {libro.autor}, ISBN: {libro.isbn}, Estado: {libro.estado}")

    def buscar_libro(self, isbn):
        for libro in self.libros:
            if libro.isbn == isbn:
                return libro
        return None

    def prestar_libro(self, isbn):
        libro = self.buscar_libro(isbn)
        if libro and libro.estado == "Disponible":
            libro.estado = "Prestado"
            print(f"El libro '{libro.titulo}' ha sido prestado.")
        elif libro:
            print(f"El libro '{libro.titulo}' ya está prestado.")
        else:
            print(f"No se encontró ningún libro con ISBN {isbn}.")

    def regresar_libro(self, isbn):
        libro = self.buscar_libro(isbn)
        if libro and libro.estado == "Prestado":
            libro.estado = "Disponible"
            print(f"El libro '{libro.titulo}' ha sido regresado.")
        elif libro:
            print(f"El libro '{libro.titulo}' ya está disponible.")
        else:
            print(f"No se encontró ningún libro con ISBN {isbn}.")
        return None