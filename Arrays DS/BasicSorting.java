public class BasicSorting {

    public static void bubbleSort(int array[]){
        boolean swapped = false;
        int n = array.length;
        for(int i =0; i < n-1; i++){
            for(int j = 0; j<n-1-i; j++){
                if(array[j] > array[j+1]){
                    //swap
                    int temp = array[j+1];
                    array[j+1] = array[j];
                    array [j] = temp;
                    swapped = true;
                }
            }
            if (swapped == false) {
                break;
            }
        }

        for(int i=0; i<n; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

    public static void selectionSort(int array[]){
        for(int i =0; i<array.length-1; i++){
            int minPos = i;
            for(int j=i+1; j<array.length; j++){
                if(array[minPos] > array[j]){
                    minPos = j;
                }
            }
            int temp = array[minPos];
            array[minPos] = array[i];
            array[i] = temp;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void insertSort(int array[]){
        for(int i = 1; i< array.length; i++){
            int temp = array[i];  //Saving this element in temp to insert it wherever it fits.

            int prev = i-1; //We are going right to left of the array coz the left side is sorted

            while(prev >= 0 && array[prev] > temp){
                array[prev+1] = array [prev];   //Pushing the prev value by one place towards right.
                prev--;
            }

            array[prev+1] = temp; //Fitting that temp value here coz it sorts the array by being here
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int numbers[] = {5,4,1,3,2};
        bubbleSort(numbers);
        selectionSort(numbers);
        insertSort(numbers);
    }
}
 