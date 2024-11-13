class Animal:
    def __init__(self, name):
        self.name = name
        self._age = 0
        self._color = "Unknown"

    def speak(self):
        raise NotImplementedError("Subclass must implement abstract method")

    def comer(self):
        raise NotImplementedError("Subclass must implement abstract method")

    def set_age(self, age):
        self._age = age

    def get_age(self):
        return self._age

    def set_color(self, color):
        self._color = color

    def get_color(self):
        return self._color


class Dog(Animal):
    def speak(self):
        return f"{self.name} says Woof!"

    def comer(self):
        return f"{self.name} is eating meat."

        
class Cat(Animal):
    def speak(self):
        return f"{self.name} dice Meow!"

    def comer(self):
        return f"{self.name} is eating fish."


class Otter(Animal):
    def speak(self):
        return f"{self.name} says Squeak!"

    def comer(self):
        return f"{self.name} is eating crabs."


class Penguin(Animal):
    def speak(self):
        return f"{self.name} says Honk!"

    def comer(self):
        return f"{self.name} is eating fish."

dog = Dog("Rex")
cat = Cat("Whiskers")
otter = Otter("Odette")
penguin = Penguin("Peter")

print(dog.speak())   
print(cat.speak()) 
print(otter.speak())  
print(penguin.speak())  

print(dog.comer())  
print(cat.comer())   
print(otter.comer())  
print(penguin.comer())  

dog.set_age(3)
cat.set_age(5)
otter.set_age(2)
penguin.set_age(1)

dog.set_color("white")
cat.set_color("orange")
otter.set_color("brown")
penguin.set_color("black and white")

print(f"{dog.name} is {dog.get_age()} years old.")
print(f"{cat.name} is {cat.get_age()} years old.")
print(f"{otter.name} is {otter.get_age()} years old.")
print(f"{penguin.name} is {penguin.get_age()} years old.")

print(f"{dog.name}'s color is {dog.get_color()}.")
print(f"{cat.name}'s color is {cat.get_color()}.")
print(f"{otter.name}'s color is {otter.get_color()}.")
print(f"{penguin.name}'s color is {penguin.get_color()}.")