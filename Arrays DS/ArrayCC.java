public class ArrayCC {

    public static void updateArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            arr[i]=arr[i]+5;
        }
    }

    public static int linearSearch(int array[], int key){
        for(int i=0; i<array.length; i++){
            if(array[i]==key){
                return i;
            }  
        }
        return-1;
    }

    public static void main(String args[]){
        
        // //Creating and array of 50 size
        // int number[] = new int[10];

        // String fruits[] = {"Apple", "Banana", "Strawberry", "Mango"};

        // //Printing whole array using for loop
        // for(int i=0; i<=3; i++){
        //     System.out.print(fruits[i]+" ");
        // }

        // // Creating an array without specifying the size
        // int marks[] = {45,75,54,67};

        // updateArray(marks); //Called function

        // for (int i = 0; i <= 3; i++) {
        //     System.out.print(marks[i] + " ");
        // }


        //------Linear Search--------
        System.out.println();

        int prices[]={2,34,54,23,67,85,12};
        int key = 67;

        int index = linearSearch(prices, key);
        if (index==-1) {
            System.out.println("Not found");
        }
        else{
            System.out.println("The key is at index "+index);
        }
    }
}
