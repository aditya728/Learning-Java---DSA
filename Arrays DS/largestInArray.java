public class largestInArray {

    // Get largest from the array Question
    public static int getLargest(int arr[]) {
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (largest < arr[i]) {
                largest = arr[i];
            }
        }
        return largest;
    }

    //Binary Search function
    public static int binarySearch(int arr[], int key){
        int start =0, end = arr.length-1;

        while(start<=end){
            int mid = (start + end)/2;

            if(arr[mid]==key){
                return mid;
            }
            if(arr[mid]<key){
                start = mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }

    public static void main(String args[]){

        int numbers[]={1,2,5,3,66,44,78};
        System.out.println("The largest number in array is "+getLargest(numbers));

        int num[] = {12,34,55,56,78,88,96};
        int key = 0;

        System.out.println("Indexx for the key is "+binarySearch(num, key));
    }  
}
