public class QuickSort {
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void quickSort(int n[], int s, int e){
        if(s>=e){
            return;
        }
        int pvtIndx = partition(n, s, e);
        quickSort(n, s, pvtIndx-1);
        quickSort(n, pvtIndx+1, e);
    }

    public static int partition(int n[], int s, int e){
        int pivot = n[e];
        int i =s-1;
        for(int j =s; j<e;j++){
            if(n[j]<=pivot){
                i++;
                //swap
                int temp = n[j];
                n[j] = n[i];
                n[i] = temp;
            }
        }
        //Doing last step to bring pivot in correct place
        i++;
        int temp = pivot;
        n[e] = n[i];
        n[i] = temp;
        return i;
    }

    public static void main(String args[]) {
        int num[] = { 6, 3, 9, 8, 2, 5 };
        quickSort(num, 0, num.length-1);
        printArray(num);
    }
}
