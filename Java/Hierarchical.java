class Animal {
    String name = "Animal";
}

class Cat extends Animal {
    String name = "Cat";

    void meow() {
        System.out.println("Meow!");
    }
}

class Dog extends Animal {
    String name = "Dog";
    void bark() {
        System.out.println("Woof!");
    }
}