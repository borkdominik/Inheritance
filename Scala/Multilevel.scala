class Animal {
    def name: String = "Animal"
}

class Mammal extends Animal {
    override def name: String = "Mammal"
}

class Cat extends Mammal {
    override def name: String = "Cat"

    def meow(): Unit = {
        println("Meow!")
    }
}