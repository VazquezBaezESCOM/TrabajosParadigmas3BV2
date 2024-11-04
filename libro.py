class Libro:
    def __init__(self):
        self._titulo = ""
        self._autor = ""
        self._isbn = ""
        self._estado = "Disponible"
    
    @property
    def titulo(self):
        return self._titulo
    
    @titulo.setter
    def titulo(self, Titulo):
        self._titulo = Titulo
   
    @property
    def autor(self):
        return self._autor
    
    @autor.setter
    def autor(self, Autor):
        self._autor = Autor
    
    @property
    def isbn(self):
        return self._isbn
    
    @isbn.setter
    def isbn(self, ISBN):
        self._isbn = ISBN
    
    @property
    def estado(self):
        return self._estado
    
    @estado.setter
    def estado(self, Estado):
        self._estado = Estado

    def __str__(self):
        return f"Título: {self._titulo}, Autor: {self._autor}, ISBN: {self._isbn}, Estado: {self._estado}"
