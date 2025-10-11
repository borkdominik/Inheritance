
// Java does not allow multiple inheritance with classes, so interfaces are a common workaround.
// Inherited methods can be implemented using the 'default' keyword or left abstract for the implementing class to define.
// methods use the attribute of the class that implements it.

class Multiple {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.pet(); // Output: "Cat: Purr..."
        cat.eat(); // Output: "Animal is eating..."
    }
}


class Cat implements Pet, Animal {
    String name = "Cat";
    @Override public void pet() {
        System.out.println(name +": Purr...");
    }
}

interface Pet {
    String name = "Pet";
    void pet();
}

interface Animal {
    String name = "Animal";
    default void eat() {
        System.out.println(name + " is eating...");
    }
}