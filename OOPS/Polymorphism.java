class A{
    void eat(){
        System.out.println("Hello");
    }
}

class B extends A{
    void eat(){ //Method overridng
        System.out.println("Eating");
    }
}

public class Polymorphism{

    //Method overloading
    public int sum(int a, int b){
        return a+b;
    }
    public int sum(int a, int b, int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        
    }
}