public class Abstraction {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.totalLegs();
        h.eats();
    }
}

abstract class Animals{
    void eats(){
        System.out.println("Eating");
    }

    abstract void totalLegs(); //This doesnt need to be implemented but every other derived class needs to implement this function.
}

class Horse extends Animals{

    void totalLegs(){
        System.out.println("Walks with 4 legs");
    }
}
