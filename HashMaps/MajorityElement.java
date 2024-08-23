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


class Solution {
    public int winningPlayerCount(int n, int[][] pick) {
        Map<Integer, Integer>[] counting = new HashMap[n];

        for(int i=0; i<n; i++){
            counting[i] = new HashMap<>();
        }

        for(int[] p : pick){
            int playerIdx = p[0];
            int pickedColor = p[1];
            counting[playerIdx].put(pickedColor, counting[playerIdx].getOrDefault(pickedColor, 0)+1);
        }

        int wins = 0;
        for(int i =0; i<n; i++){
            for(int c : counting[i].values()){
                if(c > i){
                    wins++;
                    break;
                }
            }
        }
        return wins;
    }
}