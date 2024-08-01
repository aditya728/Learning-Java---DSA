public class PrintOneToN {
    public static void main(String[] args) {
        printNums(6);
    }

    static void printNums(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printNums(n-1);
        System.out.println(n);
    }
}
 