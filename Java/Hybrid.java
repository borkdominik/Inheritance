// Inheritance can also combine classes and interfaces
// A class can extend another class and implement one or more interfaces

class Hybrid {
  public static void main(String[] args) {
    Cat cat = new Cat();
    cat.eat(); //Output: "Cat is eating..."
    cat.pet(); //Output: "Purr..."
    cat.meow(); //Output: "Meow!"

    System.out.println("Cat is the same as Animal? " + Cat.class.equals(Animal.class)); //Output: "Cat is the same as Animal? false"
    System.out.println("Cat is the same as Pet? " + Cat.class.equals(Pet.class)); //Output: "Cat is the same as Pet? false"

    System.out.println("Cat is an Animal? " + (cat instanceof Animal)); //Output: "Cat is an Animal? true"
    System.out.println("Cat is a Pet? " + (cat instanceof Pet)); //Output: "Cat is a Pet? true"
  }
}

class Animal {
    String name = "Animal";
    void eat() {
        System.out.println(name + " is eating...");
    }
}

interface Pet {
    void pet();
}

class Cat extends Animal implements Pet {
    public Cat() {this.name = "Cat";}
    @Override public void pet() {
        System.out.println("Purr...");
    }
    void meow() {
        System.out.println("Meow!");
    }
}

