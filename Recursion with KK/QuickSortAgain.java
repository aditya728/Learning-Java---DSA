import java.util.*;
public class QuickSortAgain{

    static void sort(int[] arr, int si, int ei){
        if(si>=ei){
            return;
        }

        int pivotIndex = partition(arr, si, ei);
        sort(arr, si, pivotIndex-1); // left
        sort(arr, pivotIndex+1, ei);
    }

    static int partition(int[] arr, int si, int ei){
        int pivot=arr[ei];

        int i=si-1;

        for(int j=si; j<ei;j++){
            if(arr[j]<=pivot){
                //swapp
                i++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        i++;
        int temp=pivot;
        arr[ei]=arr[i];
        arr[i]=temp;

        return i;
    }

    public static void main(String[] args) {
        int [] arr={6,4,2,7,1,9,3};
        sort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}