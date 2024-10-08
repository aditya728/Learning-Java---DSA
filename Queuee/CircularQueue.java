public class CircularQueue {

    static class Queue {
        static int arr[];
        static int size;
        static int rear;
        static int front;

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        // isEmpty
        public static boolean isEmpty() {
            return rear == -1 && front==-1;
        }

        //isFull
        public static boolean isFull(){
            return (rear+1) % size == front;
        }

        // add
        public void add(int data) {
            if (isFull()) {
                System.out.println("Queue is full");
            }
            if(front==-1){
                front=0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        // remove
        public static int remove() {
            if (isEmpty()) {
                System.out.println("Empyt Queue");
                return -1;
            }
            int result = arr[front];
            //last element delete
            if(rear == front){
                rear = front = -1;
            }else{
                front = (front + 1) % size;
            }
            return result;
        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("Empyt Queue");
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(3);

        q.add(5);
        q.add(6);
        q.add(7);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
