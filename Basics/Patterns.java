import java.util.*;

public class Patterns{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Left Triangle pattern
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(" *");
                }
            System.out.println();
        }
    
        System.out.println();

        //Inverted left triangle
        for(int i=1; i<=n; i++){
            for(int j=1; j<=(n-i+1); j++){
                System.out.print(" *");
                }
            System.out.println();
        }

        System.out.println();

        //Half Pyramid
        for(int i =1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println();

        //Continous character pattern
        int counter=1;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(" "+counter);
                counter++;
            }
            System.out.println();
        }
    }
} 