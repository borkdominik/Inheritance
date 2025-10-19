trait Pet(){
    def name: String = "Pet"
    def pet(): Unit = {
        println(name + " is a pet.")
    }
}

trait Animal {
    def name: String = "Animal"
    def eat(): Unit = {
        println(name + " is eating...")
    }
    def pet(): Unit = {
        println(name + " is an animal.")
    }
}

class Cat extends Animal with Pet {
    override def name: String = "Cat"
    override def pet() = super.pet()
    def meow(): Unit = {
        println("Meow!")
    }
}

@main def main(): Unit = {
    val cat = new Cat
    println(cat.name) // Output: Cat
    cat.eat() // Output: Cat is eating...
    cat.meow() // Output: Meow!
    cat.pet() // Output: Cat is a pet..
}