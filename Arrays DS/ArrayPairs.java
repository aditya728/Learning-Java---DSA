public class ArrayPairs {

    public static void pairArray(int array[]){
        int allPairs = 0;
        for(int i=0; i<array.length; i++){

            for(int j=i+1; j<array.length; j++){

                System.out.print("(" + array[i] + "," + array[j] + ") ");
                allPairs++;
            }
            System.out.println();
        }
        System.out.println("Total number of pairs are: "+allPairs);
    }

    public static void main(String[] args) {
        int numbers[]={1,2,3,4};
        pairArray(numbers);
    }
}