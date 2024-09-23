import java.util.*;
public class PQforObjects{
    public static class Student implements Comparable<Student>{
        int rank;
        String name;

        public Student(int rank, String name){
            this.rank = rank;
            this.name = name;
        }

        @Override
        public int compareTo(Student s2){
            return this.rank - s2.rank;
        }
    }
    //Notes added in NoteBook
    public static void main(String[] args){
        //Students class is our designed class
        PriorityQueue<Student> pq = new PriorityQueue<>();

        pq.add(new Student(5, "A"));
        pq.add(new Student(1, "B")); 
        pq.add(new Student(10, "H"));
        pq.add(new Student(7, "F"));

        while(!pq.isEmpty()){
            System.out.println(pq.peek().name + " -> " + pq.peek().rank);
            pq.remove();
        }
    }
}