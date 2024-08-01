import java.util.*;
public class StackWithDeque {
    static class Stack{
        Deque<Integer> deq = new LinkedList<>();

        public void push(int data){
            deq.addLast(data);
        }

        public int pop(){
            return deq.removeLast();
        }

        public int peek(){
            return deq.getLast();
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
    }
}
