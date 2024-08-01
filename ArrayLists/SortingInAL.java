import java.util.*;
public class SortingInAL {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        Collections.sort(list); //Sorts the AL
        System.out.println(list);

        Collections.sort(list, Collections.reverseOrder()); //Sorts AL in descending
        System.out.println(list);
    }
} 
