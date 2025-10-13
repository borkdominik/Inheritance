trait Pet(){
    def name: String = "Pet"
    def pet(): Unit {}
}

trait Animal {
    def name: String = "Animal"
    def eat(): Unit = {
        println(name + " is eating...")
    }
}

class Cat extends Animal with Pet {
    override def name: String = "Cat"
    override def pet(): Unit = {
        println(name + ": Purr...");
    }
    def meow(): Unit = {
        println("Meow!")
    }
}

@main def main(): Unit = {
    val cat = new Cat
    println(cat.name) // Output: Cat
    cat.eat() // Output: Cat is eating...
    cat.meow() // Output: Meow!
    cat.pet() // Output: Cat: Purr...
}