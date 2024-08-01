import java.util.Arrays;

public class SelectionSort {

    static void selectionSorting(int arr[], int i, int n, int max){
        if(n==0){
            return;
        }
        if(i<n){
            if(arr[i]>arr[max]){
                selectionSorting(arr, i+1, n, i);
            }else{
                selectionSorting(arr, i+1, n, max);
            }
        }
        else{
            //swap
            int temp=arr[max];
            arr[max]=arr[n-1];
            arr[n-1]=temp;
            selectionSorting(arr, 0, n-1, 0);
        }
    }

    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        selectionSorting(arr, 0, arr.length, 0);
        System.out.println(Arrays.toString(arr));
    }
}