// Parent/Base class
class Animal{
    void eats(){
        System.out.println("Eats");
    }

    void breathe(){
        System.out.println("Breathes");
    }

}

// Child/Derived/Subclass class (Single level)
class Dog extends Animal{
    //Now this class already has the methods in Animal class.

    void barks(){
        System.out.println("Barking"); //Extra function out from Animal class.
    }
}

//Multilevel Inheritance
class Pitbull extends Dog{
    void attack(){
        System.out.println("Powerful attack");
    }
}

//Hierarchial Inheritance
class Cat extends Animal{ //2nd class derived from Base class
    void meows(){
        System.out.println("Meowing");
    }
}

//Hybrid can be done by mixing all these types

public class Inheritance {
    public static void main(String[] args) {
        
    }
}
