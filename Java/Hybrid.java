class Hybrid {
  public static void main(String[] args) {
      Cat cat = new Cat();
      cat.eat(); //Output: "Cat is eating..."
      cat.pet(); //Output: "Purr..."
      System.out.println("Cat is the same as Animal? " + Cat.class.equals(Animal.class)); //Output: "Cat is the same as Animal? false"
      System.out.println("Cat is an Animal? " + (cat instanceof Animal)); //Output: "Cat is an Animal? true"
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
    Cat() {
        this.name = "Cat";
    }

    public void pet() {
        System.out.println("Purr...");
    }

    void meow() {
        System.out.println("Meow!");
    }
}

