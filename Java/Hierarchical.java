class Hierarchical {
    public static void main(String[] args) {
        Animal animal = new Animal();
        System.out.println(animal.name); // Output: Animal
        animal.eat(); // Output: Animal is eating...

        Cat cat = new Cat();
        System.out.println(cat.name); // Output: Cat
        cat.eat(); // Output: Cat is eating...
        cat.meow(); // Output: Meow!

        Dog dog = new Dog();
        System.out.println(dog.name); // Output: Dog
        dog.eat(); // Output: Dog is eating...
        dog.bark(); // Output: Woof!
    }
}

class Animal {
    String name = "Animal";
    void eat() {
        System.out.println(name + " is eating...");
    }
}

class Cat extends Animal {
    public Cat() {this.name = "Cat";}
    void meow() {
        System.out.println("Meow!");
    }
}

class Dog extends Animal {
    public Dog() {this.name = "Dog";}
    void bark() {
        System.out.println("Woof!");
    }
}
