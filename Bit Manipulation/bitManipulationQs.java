public class bitManipulationQs {

    //Finding ith bit
    public static int find_ith(int num, int i){
        int bitMask = 1<<i;
        if((num & bitMask)==0){
            return 0;

        }else{
            return 1;
        }
    }

    //Setting ith bit
    public static int set_ith(int num, int i) {
        int bitMask = 1 << i;
        return num | bitMask;
    }

    //Clearing ith bit
    public static int clear_ith(int num, int i) {
        int bitMask = ~(1 << i);
        return num & bitMask;
    }

    //Clearing last i bits
    public static int clearIbits(int num, int i){
        int bitMask = (~0)<<i;
        return num & bitMask;
    }

    //Clearing range of i bits
    public static int clearRangeOfBits(int num, int i, int j){
        int a = ((~0)<<(j+1)); 
        int b = (1<<i)-1;
        int bitMask = a|b;
        return num & bitMask;
    }

    //Power of 2 or not
    public static boolean isPowerOfTwo(int n){
        return (n&(n-1))==0;
    }

    //Count the set bits
    public static int countBits(int n){
        int count =0 ;
        while(n>0){
            if((n&1)!=0){
                count++;
            }
            n=n>>1;
        }
        return count;
    }

    public static void main(String args[]){
        int number = 10;
        System.out.println(find_ith(number, 2));    
        System.out.println(set_ith(number, 2));    
        System.out.println(clear_ith(number, 3));  
        System.out.println(clearIbits(number, 3)); 
        System.out.println(clearRangeOfBits(number, 0, 1));   
        System.out.println(isPowerOfTwo(16));

        System.out.println(countBits(7));
    }
}
