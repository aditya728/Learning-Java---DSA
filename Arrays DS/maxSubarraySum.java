public class maxSubarraySum {

    //Brute Force approach for Max Sum of subarray
    public static void maxSubarrayAdd(int number[]) {

        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < number.length; i++) {

            for (int j = i; j < number.length; j++) {
                currSum = 0;

                for (int k = i; k <= j; k++) {
                    currSum += number[k];
                }

                // System.out.println(currSum);
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("The maximum sum of the subarray is " + maxSum);
    }

    //Prefix sum approach :- O(n square)
    public static void prefixSum(int numbers[]){

        int currSum = 0;
        int maxSum= Integer.MIN_VALUE;
        int prefixArray[] = new int[numbers.length];
        
        //Calculating prefix array
        prefixArray[0]= numbers[0];
        for(int i=1; i<prefixArray.length; i++){
            prefixArray[i]=prefixArray[i-1]+numbers[i];
        }

        for(int i=0; i<numbers.length; i++){
            int start=i;

            for(int j=i; j<numbers.length; j++ ){
                int end=j;

                if(start == 0){
                    currSum = prefixArray[end];
                }
                else{
                    currSum = prefixArray[end]-prefixArray[start-1];
                }

                if(maxSum<currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("The maximum sum of the subarray is " + maxSum);
    }

    //Kadane's Algorithm
    public static void kadanesAlgo(int numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            currSum += numbers[i];
            
            if (currSum > maxSum) {
                maxSum = currSum;
            }

            if (currSum < 0) {
                currSum = 0;
            }
        }
        System.out.println("The maximum sum of the subarray is " + maxSum);
    }

    public static void main(String[] args) {
        int number[]={-3,-5,-9};
        // maxSubarrayAdd(number);
        prefixSum(number);
        kadanesAlgo(number);
    }

}
