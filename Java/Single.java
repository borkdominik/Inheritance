class Single {
    public static void main(String[] args) {
        Animal animal = new Animal();
        System.out.println(animal.name); // Output: Animal
        animal.eat(); // Output: Animal is eating...

        Cat cat = new Cat();
        System.out.println(cat.name); // Output: Cat
        cat.eat(); // Output: Cat is eating...
        cat.meow(); // Output: Meow!
    }
}

class Animal {
    String name = "Animal";
    void eat() {System.out.println(name + " is eating...");}
}

class Cat extends Animal {
    Cat() {this.name = "Cat";}
    void meow() {System.out.println("Meow!");}
}