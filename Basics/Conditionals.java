
// import java.util.*;

// public class Conditionals{
//     public static void main(String args[])
//     {
//         Scanner sc = new Scanner(System.in);
//         int age = sc.nextInt();

//         if (age >=18 && age<=70){
//             System.out.println("You can drive");
//         }
//         else{
//             System.out.println("You cannot drive");
//         }
//     }
// }

import java.util.*;

public class Conditionals{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        // Large in 2 number

        // int num2 = sc.nextInt();
        // int num1 = sc.nextInt();

        // if(num1>num2){
        //     System.out.println(num1+" is the large number.");
        // }
        // else{
        //     System.out.println(num2 + " is the large number.");
        // }

        // Odd or Even

        // int number = sc.nextInt();

        // if (number%2==0){
        //     System.out.println("The number is even");
        // }
        // else{
        //     System.out.println("The number is odd");
        // }

        // //Odd even using ternary
        // int number =sc.nextInt();

        // String answer = ((number%2)==0)? "EVEN":"ODD";
        // System.out.println(answer);

        //Income Tax Calculation
        System.out.println("Type your income in Lakhs");
        int income = sc.nextInt();

        if (income < 500000){
            System.out.println("You have to pay 0 rupees as tax");
        }
        else if(income >500000 && income < 1000000){
            System.out.println("You have to pay "+ income*0.20+" rupees as tax");
        }

        else{
            System.out.println("You have to pay " + income * 0.30 + " rupees as tax");
        }
    }
} 