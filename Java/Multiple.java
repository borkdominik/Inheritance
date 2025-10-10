class Multiple {
    public static void main() {
        Cat cat = new Cat();
        cat.pet(); // Output: Pet is being petted.
        cat.eat(); // Output: Animal is eating...
        //System.out.println(cat.name); // would cause a compile-time error due to ambiguity
    }

}

class Cat implements Pet, Animal {
}

interface Pet {
    String name = "Pet";

    default void pet() {
        System.out.println(name + " is being petted.");
    }
}
interface Animal {
    String name = "Animal";

    default void eat(){
        System.out.println(name + " is eating...");
    }
}