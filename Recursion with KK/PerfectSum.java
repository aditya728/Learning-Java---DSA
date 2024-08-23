public class PerfectSum{ //GFG question

    public static int perfectSum(int arr[], int n, int sum) {
        int i = 0;
        int s = 0;
        return recursive(arr, n, sum, i, s);
    }

    public static int recursive(int arr[], int n, int sum, int i, int s){
	    if(i==n){
	        if(s==sum) return 1;
	        return 0;
	    }
	    
	    //pick
        s += arr[i];
	    int l = recursive(arr,n,sum,i+1, s);
        
	    //remove
        s -= arr[i];
	    
	    //not pick
        int r = recursive(arr, n, sum, i+1, s);

        return l+r;
	}

    public static void main(String[] args) {
        int n = 6; 
        int[] arr = {5, 2, 3, 10, 6, 8};
        int sum = 10;
        System.out.println(perfectSum(arr, n, sum));
    }
}