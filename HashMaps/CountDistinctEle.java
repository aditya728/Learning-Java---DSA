import java.util.*;
public class CountDistinctEle {

    public static int countDistinct(int[] nums){
        HashSet<Integer> set = new HashSet<>();

        for(int i : nums){
            set.add(i);
        }
        return set.size();
    }

    public static void main(String[] args) {
        int arr[] = {4,3,2,5,6,7,3,4,2,1};
        System.out.println(countDistinct(arr));
    }
}
