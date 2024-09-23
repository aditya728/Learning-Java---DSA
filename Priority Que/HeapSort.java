public class HeapSort {

    public static void heapify(int i, int[] arr, int n){
        int maxIdx = i;
        int left = 2*i + 1;
        int right = 2*i + 2;

        if(left < n && arr[maxIdx] < arr[left]){
            maxIdx = left;
        }

        if(right < n && arr[maxIdx] < arr[right]){
            maxIdx = right;
        }

        if(maxIdx != i){
            //swap
            int temp = arr[maxIdx];
            arr[maxIdx] = arr[i];
            arr[i] = temp;

            heapify(maxIdx, arr, n);
        }
    }

    public static void heapSort(int[] arr){
        //build a max heap
        int n = arr.length;
        for(int i = n/2; i>=0; i--){
            heapify(i, arr, n);
        }

        //push largest at end
        for(int i = n-1; i>0; i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(0, arr, i);
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,4,5,3};
        heapSort(arr);
        
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
