public class mergeSort {

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void mergeSorting(int arr[], int s, int e) {
        if (s >= e) {
            return;
        }

        int mid = s + (e - s) / 2;
        mergeSorting(arr, s, mid);
        mergeSorting(arr, mid + 1, e);

        merge(arr, s, mid, e);
    }

    public static void merge(int arr[], int s, int mid, int e) {
        int temp[] = new int[e-s+1];
        int i = s;
        int j = mid + 1;
        int k = 0;

        while(i<=mid && j <= e){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }
            else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        while(i<=mid){
            temp[k++] = arr[i++];
        }
        while(j <= e){
            temp[k++] = arr[j++];
        }

        for(k=0, i=s; k<temp.length; k++, i++){
            arr[i] = temp[k];
        }
    }

    public static void main(String args[]) {
        int num[] = {2,5,7,1,7,3,4};
        mergeSorting(num, 0, num.length-1);
        printArray(num);
    }
}
