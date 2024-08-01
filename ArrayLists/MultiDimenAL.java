import java.util.*;
public class MultiDimenAL {
    public static void main(String[] args) {

        //MultiDimensional ArrayList
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
         
        ArrayList<Integer> list1=new ArrayList<>(); //These 3 list are added inside the mainlist 
        ArrayList<Integer> list2=new ArrayList<>();
        ArrayList<Integer> list3=new ArrayList<>();

        for(int i=1;i<=5;i++){
            list1.add(i*1);
            list2.add(i*2);
            list3.add(i*3);
        }

        mainList.add(list1); 
        mainList.add(list2);
        mainList.add(list3);
        System.out.println(mainList); //Prints the multidimensional array in straight form

        for(int i=0;i<mainList.size();i++){
            ArrayList<Integer> currList = mainList.get(i); //Returns list 1 then 2 then 3
            for(int j=0;j<currList.size();j++){
                System.out.print(currList.get(j)+" "); //Printing each list added in mainlist
            }
            System.out.println();
        }
    }
}
