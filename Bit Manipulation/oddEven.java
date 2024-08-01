import java.util.*;
public class oddEven {

    public static void oddOrEven(int num){
        int ans = num & 1;  //Bitmask
        if(ans==1){
            System.out.println("Odd");
        }
        else{
            System.out.println("Even");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int binNumber = sc.nextInt();
        oddOrEven(binNumber);
    }  
}
