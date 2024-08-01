import java.util.*;

public class matrixArray {

    public static boolean searchInMatrix(int arr[][], int key){
        for(int i = 0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                if(arr[i][j] == key){
                    System.out.println("Found the key at "+ "("+i+","+j+")");

                    return true;
                }
            }
        }
        System.out.println("Key not found");
        return false;
    }

    public static void largeAndSmall(int arr[][]){
        int maxNum = Integer.MIN_VALUE;
        int minNum = Integer.MAX_VALUE;

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length;j++){
                if(arr[i][j] > maxNum){
                    maxNum = arr[i][j];
                }
                if (arr[i][j] < minNum) {
                    minNum = arr[i][j];
                }
            }
        }
        System.out.println("Maximum number is "+maxNum+" and minimum number is "+minNum);
    }

    public static void giveMatrix(int arr[][]){
        int n = arr.length; // Row size
        int m = arr[0].length; // Column size as its calculating the 0th element length i.e 0th row's length
                                  // and tht is column.

        // Taking input of 2D array
        Scanner sc = new Scanner(System.in);
        System.out.println("Input your 2D Array");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            } // Taking input for the rows and cols of the matrix/2D arrays.
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        int matrix[][]= new int[3][3]; //Decalring size of a 2D array.
        giveMatrix(matrix);
        searchInMatrix(matrix, 8);
        largeAndSmall(matrix);
    }
}
