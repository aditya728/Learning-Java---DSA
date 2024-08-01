public class stringPalindrome {

    public static boolean palindromeString(String str){
        for(int i=0; i<str.length()/2; i++){
            if(str.charAt(i) != str.charAt(str.length()-1-i)){
                System.out.println("Not palindrome");
                return false;
            }
        }
        System.out.println("Palindrome");
        return true;
    }

    public static void main(String[] args) {
        String string = "asas";
        palindromeString(string);
    }
}
