// overRiding class name pani same ani parameter pani same
    // The method name, return type, and parameters must be the same as in the
    // parent class.

// Parent Class
class Animal {
    void sound() {
        System.out.println("Animals make sounds");
    }
}

// Child Class
class Dog extends Animal {

    void sound() {
        System.out.println("Dog barks");
    }
}

public class P2_OverridingExample {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();  
        myAnimal.sound(); 
        Animal myDog = new Dog(); 
        myDog.sound(); 
    }
}
