public class StringSubset {

    static void findSubset(String str, String newStr, int i){
        if(i == str.length()){
            System.out.println(newStr + " ");
            return;
        }

        findSubset(str, newStr+str.charAt(i), i+1);
        findSubset(str, newStr, i+1);
    }

    public static void main(String[] args) {
        String str = "abc";
        findSubset(str , "", 0);
    }
}
