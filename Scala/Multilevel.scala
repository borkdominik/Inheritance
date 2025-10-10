class Animal {
    def name: String = "Animal"

    def eat(): Unit = {
        println(name + " is eating...")
    }
}

class Mammal extends Animal {
    override def name: String = "Mammal"

    def shed(): Unit = {
        println("Shedding fur...")
    }
}

class Cat extends Mammal {
    override def name: String = "Cat"

    def meow(): Unit = {
        println("Meow!")
    }
}

@main def main(): Unit = {
    val animal = new Animal
    println(animal.name) // Output: Animal
    animal.eat() // Output: Animal is eating...

    val mammal = new Mammal
    println(mammal.name) // Output: Mammal
    mammal.eat() // Output: Mammal is eating...
    mammal.shed() // Output: Shedding fur...

    val cat = new Cat
    println(cat.name) // Output: Cat
    cat.eat() // Output: Cat is eating...
    cat.shed() // Output: Shedding fur...
    cat.meow() // Output: Meow!
}