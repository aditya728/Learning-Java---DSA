import java.util.*;
public class ReverseString {

    public static void reverseString(Stack<Character> st, String str){
        for (int i=0;i<str.length();i++){
            st.push(str.charAt(i));
        }

        while(!st.isEmpty()){
            System.out.print(st.pop()+"");
        }
    }

    public static void main(String[] args) {
        String str = "HelloWorld";
        Stack<Character> st = new Stack<>();

        reverseString(st, str);
    }
}
