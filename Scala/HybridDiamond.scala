trait Animal {
    def name: String = "Animal"
    def eat(): Unit = {
        println(name + " is eating...")
    }
}

trait Cat extends Animal {
    override def name: String = "Cat"
    def meow(): Unit = {
        println("Meow!")
    }
}

trait Dog extends Animal {
    override def name: String = "Dog"
    def bark(): Unit = {
        println("Woof!")
    }
}

class CatDog extends Cat with Dog {
}

@main def main(): Unit = {
    val catDog = new CatDog
    println(catDog.name) // Output: Dog
    //Dog is the last trait mixed in and therefore overwrites previous definitions
    catDog.eat() // Output: Dog is eating...
    catDog.meow() // Output: Meow!
    catDog.bark() // Output: Woof!
}