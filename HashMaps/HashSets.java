import java.util.*;

public class HashSets {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();

        // hs.add(2);
        // // System.out.println(hs.contains(2));
        // // hs.remove(2);
        // System.out.println(hs);

        //Iteration
        // a) Using iterator
        cities.add("Delhi");
        cities.add("Bengaluru");
        cities.add("Noida");
        cities.add("Mumbai");

        Iterator it = cities.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println();
        
        // b) Enhanced for loop
        for( String city : cities){
            System.out.println(city);
        }
    }
}
