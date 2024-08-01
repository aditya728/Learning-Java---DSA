public class ReverseArray {

    public static void revArray(int array[]){

        int start = 0, end= array.length -1;

        while(start<end){
            int temp = array[end];
            array[end]=array[start];
            array[start]= temp;

            start++;
            end--;
        }

        //Printing the reversed array
        for(int i=0; i< array.length; i++){
            System.out.print(array[i]+" ");
        }
    }
    
    public static void main(String args[]){
        int array[] = {1,2,3,4,5,6,7};

        System.out.println("Before reverse");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();
        System.out.println("After reverse");
        revArray(array);

    }
}
