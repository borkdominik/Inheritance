class Multilevel {
    public static void main(String[] args) {
        Animal animal = new Animal();
        System.out.println(animal.name); // Output: Animal
        animal.eat(); // Output: Animal is eating...

        Mammal mammal = new Mammal();
        System.out.println(mammal.name); // Output: Mammal
        mammal.eat(); // Output: Mammal is eating...
        mammal.shed(); // Output: Shedding fur...

        Cat cat = new Cat();
        System.out.println(cat.name); // Output: Cat
        cat.eat(); // Output: Cat is eating...
        cat.shed(); // Output: Shedding fur...
        cat.meow(); // Output: Meow!
    }
}

class Animal {
    String name = "Animal";
    void eat() {
        System.out.println(name + " is eating...");
    }
}

class Mammal extends Animal {
    public Mammal() {this.name = "Mammal";}
    void shed() {
        System.out.println("Shedding fur...");
    }
}

class Cat extends Mammal {
    public Cat() {this.name = "Cat";}
    void meow() {
        System.out.println("Meow!");
    }
}