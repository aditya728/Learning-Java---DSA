/* 
import java.util.*;

public class InOut{
public static void main(String[] args){
    Scanner sb = new Scanner(System.in);
    int radius  = sb.nextInt();        
    double areaOfCircle = 3.14 * radius * radius;
    
    System.out.println(areaOfCircle);
    
    }
} */

/*
import java.util.*;

public class InOut {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //creating class which will take the further inputs

        int table = sc.nextInt();   //taking input

        System.out.println(table +" X 1 = "+ table*1);
        System.out.println(table +" X 2 = "+ table*2);
        System.out.println(table +" X 3 = "+ table*3);
        System.out.println(table +" X 4 = "+ table*4);
        System.out.println(table +" X 5 = "+ table*5);
        System.out.println(table +" X 6 = "+ table*6);
        System.out.println(table +" X 7 = "+ table*7);
        System.out.println(table +" X 8 = "+ table*8);
        System.out.println(table +" X 9 = "+ table*9);
        System.out.println(table +" X 10 = "+ table*10);
        
    }
} */

/*
import java.util.*;

public class InOut {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Type casting
        float a = 29.92f; //f is added to let it get typecasted
        System.out.println(a);
        int b = (int) a; //typecasting from float to int even after knowing it can cause data loss.
        System.out.println(b); 

        //Type Promotion
        //Java converts shor, char and byte to int type in any expression for eg. a+b*c/e etc.
        //If one operand is long, float, or double then whole expression will promote to highest type in the expresion.
        char one = 'a';
        char two = 'b';
        System.out.println(two-one);

    }
}  */

//How is our code running?
// The 1.source code is compiled by 2.compiler and a 3.byte code(.class) is formed which is converted by the 4.JVM into 5. Native Code.

import java.util.*;

public class InOut{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        float pencil = sc.nextInt();
        float eraser = sc.nextInt();
        float pen = sc.nextInt();
        float gst = (pencil+eraser+pen)*0.18f;
        float bill = (float) (pencil+eraser+pen)+ gst;
        
        System.out.println("The total bill with GST is "+bill);
    }
}