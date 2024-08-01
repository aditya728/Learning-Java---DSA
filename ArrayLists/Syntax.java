import java.util.ArrayList; //For using ArrayList
public class Syntax {
    public static void main(String args[]){

        //Creating a arraylist of type Integer(int)
        ArrayList<Integer> list = new ArrayList<>();
    
        //Operation in ArrayList
        //1. Add O(1)
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        // System.out.println(list);

        // //Adds 10 at index 2 and takes O(n)
        list.add(2, 10); 
        // System.out.println(list);

        //2. Get element  O(1)
        int element=list.get(4);
        // System.out.println(element);

        // 3. Remove element O(n)
        list.remove(2);
        // System.out.println(list);

        // 4. Set element at index O(n)
        list.set(2,10);
        // System.out.println(list);

        // 5. Conatains element O(n)
        System.out.println(list.contains(6));

        System.out.println(list.size());
    }
}
