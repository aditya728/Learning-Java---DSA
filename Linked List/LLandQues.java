import java.util.LinkedList;

public class LLandQues {

    //Nested class Node for creating objects of node (linked list)
    public static class Node{
        int data; //instance variable
        Node next; // instance variable pointing to the same class

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    //Defining head and tail as a property in the class itself
    public static Node head;
    public static Node tail;
    public static int size;

    //Method for addFirst in LL
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        } 
        newNode.next=head;
        head = newNode;
    }

    // Method for addLast in LL
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }

    // Method for Printing the LL
    public void print(){
        if(head==null){
            System.out.println("LL is null");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    // Method for addMiddle in LL
    public void add(int index, int data){
        if(index==0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i=0;

        while(i<index-1){
            temp=temp.next;
            i++;
        }

        newNode.next=temp.next;
        temp.next=newNode;
    }

    //Method to delete head/first node in LL
    public int removeFirst(){
        if(size==0){
            System.out.println("LL is emtpy");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            size=0;
            int val = head.data;
            head =tail= null;
            return val;
        }
        size--;
        int val=head.data;
        head = head.next;
        return val;
    }

    // Method to delete tail/last node in LL
    public int removeLast(){
        if(size==0){
            System.out.println("LL empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val=tail.data;
            size=0;
            head=tail=null;
            return val;
        }
        Node prev = head;
        for(int i=0;i<size-2;i++){
            prev = prev.next;
        }
        int val = tail.data;
        prev.next=null;
        tail=prev;
        size--;
        return val;
    }

    //Q.1 Reverse a linked list
    public void reverseLL(){
        Node prev=null;
        Node curr=tail=head;
        Node next;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }

    //Q.2 Delete the nth node from n
    public void deleteNthNode(int n){
        int size=0;
        Node temp = head;
        while(temp!=null){
            temp=temp.next;
            size++;
        }

        if(n==size){
            head = head.next;
            return;
        }
        int i=1;
        int iToDel=size-n;
        Node prev=head;
        while(i<iToDel){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return;
    }

    //Q.3 Check if Linked List is palindrome
    public Node findMid(Node head){
        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    public boolean isPalindrome(){
        if(head==null || head.next==null){
            return true;
        }
        //step-1 Find mid
        Node mid=findMid(head);

        //step-2 reverse 2nd half
        Node prev=null;
        Node curr=mid;

        while(curr!=null){
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node right=prev;
        Node left=head;

        //step-3 check if 1st half = 2nd half
        while(right!=null){
            if(left.data != right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }
    
    //Q.4 Remove a cycle in a Lonked List
    public static void removeCycle(){
        //Find the cycle
        Node slow=head;
        Node fast = head;
        boolean cycle = false;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                cycle=true;
                break;
            }
        }
        if(cycle==false){
            return;
        }

        //Find the meet point
        slow=head;
        Node prev=null;
        while(slow!=fast){
            prev=fast;
            slow=slow.next;
            fast=fast.next;
        }

        //Removing cycle
        prev.next=null;
    }
    //Q.5 Merge sort on a linked List
    //Function to find mid but we'll find the mid-1 as mid by assigning fast=fast.next
    public Node findMiddle(Node head){
        Node slow=head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow; //Mid Node
    }

    public Node merge(Node head1, Node head2){
        Node mergeLL = new Node(-1);
        //Using the dummy so that mergeLL is not affected
        Node dummy=mergeLL;
        while(head1!=null && head2!=null){
            if(head1.data<=head2.data){
                dummy.next=head1;
                head1=head1.next;
            }else{
                dummy.next=head2;
                head2=head2.next;
            }
            dummy=dummy.next;
        }

        //Filling the remaining nodes/elements in the dummy
        while(head1!=null){
            dummy.next=head1;
            head1=head1.next;
            dummy=dummy.next;
        }
        while(head2!=null){
            dummy.next=head2;
            head2=head2.next;
            dummy=dummy.next;
        }
        return mergeLL.next;
    }

    public Node mergeSort(Node head){
        //Base case and also egde case if the list is empty
        if(head==null || head.next==null){
            return head;
        }
        //Step-1. find mid
        Node mid = findMiddle(head);
        //step-2. left and rigth MS
        Node rightHead = mid.next;
        mid.next=null;
        Node left=mergeSort(head);
        Node right = mergeSort(rightHead);

        //Step-3. merge both
        //Compare both the heads and merge it using a dummy list
        return merge(left,right);
    }

    //Q.6 Zig zag linked list
    public void zigZag(){
        //Find the mid
        Node mid = findMiddle(head);

        //Reverse the 2nd half
        Node prev = null;
        Node curr=mid.next;
        mid.next=null;
        while(curr!=null){
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node left=head;
        Node right=prev;
        //Link with two pointer
        while(left!=null && right!=null){
            Node nextL=left.next;
            left.next=right;
            Node nextR=right.next;
            right.next=nextL;

            //Update
            left=nextL;
            right=nextR;
        }
    } 

    public static void main(String args[]){
        //Creating ll object using the class
        // LLandQues newll=new LLandQues();
        // newll.addFirst(1);
        // newll.addFirst(2);
        // newll.addFirst(3);
        // newll.addFirst(3);
        // newll.addFirst(2);
        // newll.addFirst(1);
        // newll.print();

        // newll.deleteNthNode(3);
        // newll.print();

        // newll.reverseLL();
        // newll.print();
        
        // System.out.println(newll.isPalindrome());

        //----------------------------------
        // head = new Node(1);
        // Node temp = new Node(2);
        // head.next = temp;
        // head.next.next = new Node(3);
        // head.next.next.next = temp;
        // removeCycle();

        // ----------------------------------
        LLandQues ll = new LLandQues();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        ll.print();
        // ll.head=ll.mergeSort(ll.head);
        // ll.print();

        // ----------------------------------
        ll.zigZag();
        ll.print();
    }
}