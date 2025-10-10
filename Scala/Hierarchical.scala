class Animal {
    def name: String = "Animal"
}

class Cat extends Animal {
    override def name: String = "Cat"

    def meow(): Unit = {
        println("Meow!")
    }
}

class Dog extends Animal {
    override def name: String = "Dog"

    def bark(): Unit = {
        println("Woof!")
    }
}