public class fastExponentiation {

    public static int fastExpo(int a, int power){
        int ans=1;
        while(power>0){
            if((power & 1) !=0){
                ans = ans*a;
            }
            a = a*a;
            power = power>>1;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(fastExpo(10, 2));
    }
}
