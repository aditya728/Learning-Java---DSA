import java.util.Arrays;

public class Sorting {
    static void bubbleSort(int arr[], int i, int n) {
        if (n == 0) {
            return;
        }
        if(i<n){
            if(arr[i]>arr[i+1]){
                //swapp
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
            bubbleSort(arr, i+1, n);
        }else{
            bubbleSort(arr, 0, n-1);
        }
    }
    
    public static void main(String[] args) {
        int[] num={5,4,3,2,1};
        bubbleSort(num, 0, num.length-1);
        System.out.println(Arrays.toString(num));
    }
    
}
