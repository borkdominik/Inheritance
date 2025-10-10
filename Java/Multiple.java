class Multiple {
    public static void main() {
        CatDog catDog = new CatDog();
        catDog.meow();
        catDog.bark();
    }

}

class CatDog implements Cat, Dog {

}

interface Cat {
    default void meow(){
        System.out.println("Meow");
    }
}
interface Dog {
    default void bark(){
        System.out.println("Woof");
    }
}