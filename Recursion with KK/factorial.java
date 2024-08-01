public class factorial {
    public static void main(String[] args) {
        System.out.println(findFac(5));
    }

    static int findFac(int n){
        if(n==2){
            return n;
        }
        return n*findFac(n-1);
    }
}
