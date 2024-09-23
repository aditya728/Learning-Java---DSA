import java.util.*;
public class Implement {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(9);
        pq.add(5);
        pq.add(4);
        pq.add(11);
        pq.add(2); //by default this will have the highest priority

        while(!pq.isEmpty()){
            System.out.println(pq.peek());
            pq.remove();
        }
    }
}
