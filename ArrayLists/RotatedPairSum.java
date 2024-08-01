import java.util.ArrayList;

public class RotatedPairSum {

    public static boolean rotatedTwoSum(ArrayList<Integer> list, int target){

        int n=list.size();

        int bp=-1;
        for(int i=0; i<n;i++){
            if(list.get(i)>list.get(i+1)){
                bp=i; 
                break;
            }
        }

        int lp=bp+1;
        int rp=bp;
        
        while(lp!=rp){
            int sum=list.get(lp)+list.get(rp);
            if(sum==target){
                return true;
            }

            if(target<sum){
                //rp--;
                rp=(n+rp-1)%n;
            }else{
                //lp++;
                lp=(lp+1)%n;
            }
        }
        return false;
    }

    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(16);
        list.add(18);
        list.add(19);
        list.add(10);

        System.out.println(rotatedTwoSum(list, 21));
    }
}
