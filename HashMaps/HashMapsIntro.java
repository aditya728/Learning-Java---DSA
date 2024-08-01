import java.util.HashMap;
public class HashMapsIntro{

    public static void main(String[] args) {
        //create
        HashMap<String, Integer> hm = new HashMap<>();

        //Insert - O(1)
        hm.put("India", 120);
        hm.put("US", 10);

        System.out.println(hm);

        //Get - O(1)
        int population = hm.get("India");
        System.out.println(population);

        //ContainsKey - O(1)
        System.out.println(hm.containsKey("Austrailia"));

        //remove - O(1)
        System.out.println(hm.remove("US"));

        //size 
        System.out.println(hm.size());

        //clear
        hm.clear();
        System.out.println(hm.isEmpty());
    }
} 