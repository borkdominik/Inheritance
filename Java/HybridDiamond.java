// Instead of combining classes and interfaces, hybrid inheritance can also combine different types of inheritance.
// This example shows a diamond shape consisting of hierarchical and multiple inheritance using interfaces.

class HybridDiamond {
    public static void main(String[] args) {
        CatDog catDog = new CatDog();
        catDog.eat(); //Output: "Animal is eating..."
        catDog.meow(); //Output: "Cat: Meow"
        catDog.bark(); //Output: "Dog: Woof"
        
        //System.out.println(catDog.name); 
        //This would cause a compile-time error due to ambiguity, 
        //  as it is defined in both Cat and Dog
        
    }
}

class CatDog implements Cat, Dog {}

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
