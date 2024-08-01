public class removeA {
    public static void main(String[] args) {
        String str = "baccad";
        StringBuilder sb = new StringBuilder("");
        System.out.println(removeChar(str, 0, sb));
    }

    static String removeChar(String str, int i, StringBuilder newStr){
        if(i == str.length()){
            return newStr.toString();
        }
        
        if(str.charAt(i)!='a'){
            return removeChar(str, i+1, newStr.append(str.charAt(i)));
        }else{
            return removeChar(str, i+1, newStr);
        }
    }
}
