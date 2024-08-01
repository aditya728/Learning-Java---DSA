public class StringCompression {

    public static String compressString(String str){
        StringBuilder compressed = new StringBuilder("");
        for(int i =0; i<str.length(); i++){
            Integer counter = 1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                counter++;
                i++;
            }
            compressed.append(str.charAt(i));
            if(counter >1){
                compressed.append(counter.toString());
            }

        }
        return compressed.toString();
    }

    public static void main(String[] args) {
        String str="abcd";
        System.out.println(compressString(str));
    }
}
