class Multiple implements Cat, Dog {
    public static void main() {
        
    }

}

interface Cat {
    default void meow(){
        println("Meow")
    }
}
interface Dog {
    default void bark(){
        println("Woof")
    }
}