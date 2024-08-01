import java.util.*;
public class Loops {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        //While Loop

        // int counter=1;

        // while(counter<=10){
        //     System.out.print(counter+" ");
        //     counter++;
        // }

        //Sum of n natural numbers

        // int i=1;
        // int finalNum = sc.nextInt();
        // int sum=0;
        // while(i<=finalNum){
        //     sum+=i;
        //     i++;
        // }
        
        // System.out.println(sum);


        //For Loops
        // for(int i=1; i<=10;i++){
        //     System.out.println("$ one time!");
        // }

        //Printing Square Pattern
        // for (int i = 1; i <=4; i++) {
        //     System.out.println("* * *  *");
        // }

        //Printing the reverse of a number

        // int number = sc.nextInt();
        // int reverse = 0;
        // while(number>0){
        //     reverse = number%10;
        //     System.out.print(reverse);
        //     number/=10; 
        // }

        // Printing the reverse of a number without printing each number

        // int number = sc.nextInt();
        // int reverse = 0;
        // int lastDigit = 0;

        // while(number>0){
        //     lastDigit = number%10;
        //     reverse = (reverse*10)+lastDigit;
        //     number = number/10;
        // }
        // System.out.println(reverse);

        //Do-while Loops

        // int counter = 1;

        // do {
        //     System.out.println(counter+". Hello!");
        //     counter++;
        // } while (counter<=10);

        //Keep entering numbers till user enters 10

        // while(true){
        //     System.out.println("Guess the number");
        //     int userNum = sc.nextInt();
        //     System.out.println(userNum);
        //     if(userNum % 10==0){
        //         break;
        //     }
        // }
        // System.out.println("We are out of the loop");

        //Identify prime number 

        int number = sc.nextInt();
        boolean isPrime = true;

        if(number == 2){
            System.out.println("The number is prime");
        }
        
        
        else{
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                }
            }
            if (isPrime==true) {
                System.out.println("Prime");
            }
            else{
                System.out.println("Not prime");
            }

        }
    }
}
