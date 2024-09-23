import java.util.*;
class Node{
    int data;
    Node left;
    Node right;

    public Node(int val){
        data = val;
        left = null;
        right = null;
    }
}

public class dfsRecursive {

    
    public static List<Integer> preOrder(Node root){
        List<Integer> ans = new ArrayList<>();
        preOrderTraverse(ans, root);
        return ans;
    }
    public static void preOrderTraverse(List<Integer> ans, Node root){
        if(root == null) return;

        ans.add(root.data);
        preOrderTraverse(ans, root.left);
        preOrderTraverse(ans, root.right);
    }

    public static List<Integer> inOrder(Node root) {
        List<Integer> ans = new ArrayList<>();
        inOrderTraverse(ans, root);
        return ans;
    }

    public static void inOrderTraverse(List<Integer> ans, Node root) {
        if (root == null)
            return;

        inOrderTraverse(ans, root.left);
        ans.add(root.data);
        inOrderTraverse(ans, root.right);
    }

    public static List<Integer> postOrder(Node root) {
        List<Integer> ans = new ArrayList<>();
        postOrderTraverse(ans, root);
        return ans;
    }

    public static void postOrderTraverse(List<Integer> ans, Node root) {
        if (root == null)
            return;

        postOrderTraverse(ans, root.left);
        postOrderTraverse(ans, root.right);
        ans.add(root.data);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        //DFS Traversals
        System.out.println(preOrder(root));
        System.out.println(inOrder(root));
        System.out.println(postOrder(root));
    }
}
