public class linearSearch {
    static int search(int arr[], int i, int target){
        if(i==arr.length){
            return -1;
        }

        if(arr[i]==target){
            return i;
        }else{
            return search(arr, i+1, target);
        }
    }

    public static void main(String[] args) {
        int arr[]={2,4,1,6,9,4,7,51};
        System.out.println(search(arr, 0, 51));
    }
}