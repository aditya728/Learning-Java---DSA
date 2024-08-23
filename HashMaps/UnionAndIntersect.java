import java.util.*;
public class UnionAndIntersect {
    public static void unionAndIntersec(int[] arr1, int[] arr2){
        HashSet<Integer> set = new HashSet<>();

        //Union
        for(int i : arr1){
            set.add(i);
        }

        for(int i : arr2){
            set.add(i);
        }
        System.out.println(set.size());

        //Intersection
        int count=0;
        set.clear();
        for(int i : arr1){
            set.add(i);
        }

        for(int i : arr2){
            if(set.contains(i)){
                count++;
                set.remove(i);
            }
        }
        System.out.println(count);
    }
    
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5,6};
        int arr2[] = {5,6,7,8};
        unionAndIntersec(arr1, arr2);
    }
}
