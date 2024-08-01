import java.util.*;
public class HashMapIteration {
    public static void main(String[] args) {
        HashMap<String, Integer> hm=new HashMap<>();

        hm.put("India", 100);
        hm.put("Indonesia", 90);
        hm.put("Europe", 50);
        hm.put("Nepal", 10);

        //Creating a keySet for hm
        Set<String> keys = hm.keySet();
        System.out.println(keys);

        //Iterating - foreach loop
        for(String key : keys){
            System.out.println("Key: "+ key + ", Value: "+ hm.get(key));
        }
    }
}
