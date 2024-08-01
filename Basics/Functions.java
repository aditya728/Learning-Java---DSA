import java.util.*;

public class Functions{

    //Our 1st function
    public static void printHello() {
        System.out.println("Hello");
    }

    public static void calcSum(int num1, int num2){
        int sum = num1 + num2;
        System.out.println(sum);
    }

    //Multiplication
    public static int multiply(int a , int b){
        int product = a*b;
        return product;
    }

    //Function for factorial
    public static int factorial(int num){
        int factorial=1;
        for (int i =1; i<=num;i++){
            factorial = factorial*i;
            
        }
        // System.out.println(factorial);
        return factorial;
    }

    //Function for binomial coefficient
    public static void binoCoefficient(int n, int r){
        int nFactorial=factorial(n);;
        int rFactorial=factorial(r);
        int diffFactorial = factorial(n-r);

        int binomial = (nFactorial) / (rFactorial * diffFactorial);
        
        System.out.println("The binomial coefficient is: "+ binomial);
    } 

    //Function for adding input digits
    public static void digitSum(int n){
        int sum=0;
        int unitPlace=0;
        while (n>0) {
            unitPlace = n%10;
            n = n/10;
            sum = unitPlace+ sum;

        }
        System.out.println(sum);
    }

    //Function for checking Prime number
    public static boolean checkPrime(int number){

        if(number ==2){
            return true;
        }

        for(int i = 2; i<= Math.sqrt(number); i++){
            if (number%i == 0) {
                return false;
            }
        } 
        return true;
    }

    public static void rangeInPrime(int range){
        for(int i = 2; i<=range; i++){
            if (checkPrime(i)){
                System.out.print(i + " ");
            }
        }
    }

    //Binary to Decimal function
    public static void binToDec(int binNum){
        int decNum = 0;
        int pow = 0;
        while(binNum>0){
            int lastDigit = binNum%10;
            decNum = decNum+ (lastDigit * (int)Math.pow(2, pow));
            pow++;
            binNum /=10;
            }
        System.out.println("The decimal number is "+decNum);
    }

    //Decimal to binary function
    public static void decToBin(int decNum){
        int pow = 0;
        int binNum=0;

        while(decNum >0){
            int lastDigit = decNum%2;

            binNum = binNum+ (lastDigit * (int)Math.pow(10, pow));

            pow++;
            decNum /= 2;
        }
        System.out.println("The binary number is "+binNum);
    }

    //Function for calculating average of 3 numbers

    public static void calcAvg(int a,int b, int c){
        float avg = (a+b+c)/3;

        System.out.println(avg);
    }

    //Reversing number function
    public static void isPalindrome(int num){
        int palindrome = num;
        int reverse = 0;

        while(palindrome>0){
            int lastDigit = palindrome%10;
            reverse = (reverse*10)+lastDigit;
            palindrome/=10;
        }

        if (num == reverse) {
            System.out.println("Palindrome number");
        }else{
            System.out.println("Not palindrome");
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        // int n = 10;
        // int m = 10;
 
        // calcSum(n, m);

        // int product = multiply(n, m);
        // System.out.println(product);

        // factorial(9);

        // binoCoefficient(9, 6);

        // digitSum(55);

        // rangeInPrime(10);

        // binToDec(101);
        // decToBin(7);

        // calcAvg(3,4,5);

        isPalindrome(131312);
    }
}
