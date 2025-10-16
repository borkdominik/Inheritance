trait Meow() {
    def meow(): Unit = {
        println("Meow!")
    }
}

trait Eat() {
    def eat(): Unit = {
        println("Eating...")
    }
}

trait Scratch() {
    def scratch(): Unit = {
        println("Scratching...")
    }
}

// ModularCat combines all three traits without a class body
class ModularCat extends Meow with Eat with Scratch {
}

@main def main(): Unit = {
    val cat = new ModularCat
    cat.meow() // Output: Meow!
    cat.eat() // Output: Eating...
    cat.scratch() // Output: Scratching...
}
