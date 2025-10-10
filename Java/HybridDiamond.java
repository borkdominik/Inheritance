class HybridDiamond {
    public static void main() {
    CatDog catDog = new CatDog();
        catDog.eat(); //Output: "Animal is eating...""
        catDog.meow(); //Output: "Cat: Meow"
        catDog.bark(); //Output: "Dog: Woof"
    }
}

class CatDog implements Cat, Dog {
    String name = "CatDog";
}

interface Animal {
    String name = "Animal";

    default void eat() {
        System.out.println(name + " is eating...");
    }
}

interface Cat extends Animal {
    String name = "Cat";
    
    default void meow(){
        System.out.println(name + ": Meow");
    }
}
interface Dog extends Animal {
    String name = "Dog";

    default void bark(){
        System.out.println(name + ": Woof");
    }
}
