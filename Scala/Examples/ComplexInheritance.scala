trait Meow() {
    def meow(): Unit = {
        println("Meow!")
    }
}

trait Pet() {
    def pet(): Unit = {
        println("Petting...")
    }
}

class Tiger extends Meow {
}

class Cat extends Meow with Pet {
}

class Dog extends Pet {
}

@main def main(): Unit = {
    val tiger = new Tiger
    tiger.meow() // Output: Meow!

    val cat = new Cat
    cat.meow() // Output: Meow!
    cat.pet() // Output: Petting...

    val dog = new Dog
    dog.pet() // Output: Petting...
}