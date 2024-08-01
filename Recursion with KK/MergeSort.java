import java.util.Arrays;

public class MergeSort {

    static void mergeSort(int arr[], int s, int e){
        if(s>=e){
            return;
        }

        int mid=(s+e)/2;

        mergeSort(arr, s, mid);
        mergeSort(arr, mid+1, e);

        merge(arr, s, mid, e);
    }

    static void merge(int arr[], int s, int mid, int e){
        int temp[] = new int[e-s+1];

        int i=s;
        int j=mid+1;
        int k=0;

        while(i<=mid && j<=e){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }
            else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }

        while(i<=mid){
            temp[k]=arr[i];
            i++;
            k++;
        }
        while(j<=e){
            temp[k]=arr[j];
            j++;
            k++;
        }

        for(k=0, i=s; k<temp.length;k++){
            arr[i]=temp[k];
            i++;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2,1,3,4,6,3,8,4,1,7,0,6,3};
        mergeSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
