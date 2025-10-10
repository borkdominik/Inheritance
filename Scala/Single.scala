class Animal {
    def name: String = "Animal"

    def eat(): Unit = {
        println(name + " is eating...")
    }
}

class Cat extends Animal {
    override def name: String = "Cat"

    def meow(): Unit = {
        println("Meow!")
    }
}

@main def main(): Unit = {
    val animal = new Animal
    println(animal.name) // Output: Animal
    animal.eat() // Output: Animal is eating...

    val cat = new Cat
    println(cat.name) // Output: Cat
    cat.eat() // Output: Cat is eating...
    cat.meow() // Output: Meow!
}