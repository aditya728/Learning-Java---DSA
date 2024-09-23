import java.util.*;
public class HeapImplement {
    static class Heap{
        List<Integer> arr = new ArrayList<>();

        public void add(int data){
            arr.add(data);

            //parent to child -> 2i + 1 and 2i + 2 where i = parent idx
            //child to parent -> (x-1)/2 where x = child idx
            int childIdx = arr.size()-1;
            int parIdx = (childIdx - 1) / 2; 

            while(arr.get(childIdx) < arr.get(parIdx)){
                int temp = arr.get(childIdx);
                arr.set(childIdx, arr.get(parIdx));
                arr.set(parIdx, temp);

                childIdx = parIdx;
                parIdx = (childIdx - 1) / 2;
            }
        }

        public int peek(){
            if(arr.size() == 0){
                return -1;
            }
            return arr.get(0);
        }

        public int remove(){
            // swap 1st and last
            int data = arr.get(0);

            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size() - 1));
            arr.set(arr.size()-1, temp);

            //remove last
            arr.remove(arr.size()-1);

            // fix heap by calling heapify()
            heapify(0);
            return data;
        }

        private void heapify(int i){
            int left = 2 * i +1;
            int right = 2 * i + 2;
            int minIdx = i;

            if(left < arr.size() && arr.get(left) < arr.get(minIdx)){
                minIdx = left;
            }

            if(right < arr.size() && arr.get(right) < arr.get(minIdx)){
                minIdx = right;
            }

            if(minIdx != i){
                //swap
                int temp = arr.get(i);
                arr.set(i, arr.get(minIdx));
                arr.set(minIdx, temp);

                heapify(minIdx);
            }
        } 

        public boolean isEmpty(){
            return arr.size() == 0;
        }
    }
    public static void main(String[] args) {
        Heap h = new Heap();

        h.add(3);
        h.add(4);
        h.add(1);
        h.add(5);

        while(!h.isEmpty()){
            System.out.println(h.peek()); 
            h.remove();
        }
    }
} 
