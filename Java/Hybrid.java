class Hybrid {
  public static void main(String[] args) {
      Cat cat = new Cat();
      cat.eat();
      System.out.println("Cat breed is " + cat.breed); //Output: "Cat breed is orange"
      System.out.println("Cat eye colour is " + cat.eyeColour); //Output: "Cat eye colour is green"
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

interface Orange {
    String breed = "orange";
}

interface GreenEyes {
    String eyeColour = "green";
}

class Cat extends Animal implements Orange, GreenEyes {
    Cat() {
        this.name = "Cat";
    }

    void meow() {
        System.out.println("Meow!");
    }
}

