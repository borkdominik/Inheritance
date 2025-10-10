class Animal {
    String name = "Animal";
}

class Mammal extends Animal {
    String name = "Mammal";
}

class Cat extends Mammal {
    String name = "Cat";

    void meow() {
        System.out.println("Meow!");
    }
}