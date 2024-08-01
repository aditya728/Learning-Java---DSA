import java.util.*;
public class stringBasics {
    public static void main(String[] args) {
        char str = 'a'; // This is a character

        String str2 = "Aditya Maurya";  //This is a string.
        System.out.println(str2.length()); //Gives the length of the string

        char stringArray[] = {'a','b','c','d'};


        //Input output in strings
        Scanner sc = new Scanner(System.in);
        //String inputString = sc.next();  //This inputs only one word for string
        //String lineString = sc.nextLine(); //Inputs whole line for string.
        
        //Concatenation in string
        String firstName = "Aditya";
        String lastName = "Maurya";
        String fullName = firstName +" "+lastName;  //Concatenated 2 strings
        System.out.println("My name is "+fullName);
        System.out.println(fullName.charAt(6));//Gives the character on the specified index


        //String Builder
        StringBuilder sb = new StringBuilder("");
        for(char ch='a'; ch<='z';ch++){
            sb.append(ch);  //Append function is used to add the chars to the StringBuilder
        }
        System.out.println(sb);
    }
}
