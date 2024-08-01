import java.util.*; 
public class MajorityElement {

    public static int majority(int [] nums){
        int n = nums.length; 
        int ans = -1;
        HashMap <Integer, Integer> hm = new HashMap<>();

        for(int key : nums){
            hm.put(key, hm.getOrDefault(key, 0) + 1);
        }

        Set<Integer> keySet = hm.keySet();
        for(int key : keySet){
            if(hm.get(key) > n/3){
                ans = key;
                break;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,2,5,1,3,1,5,1};
        System.out.println(majority(nums));
    }
}
