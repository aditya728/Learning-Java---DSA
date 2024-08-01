public class DiceRoll {
    
    static void totalCombinations(String p, int target){
        if(target==0){
            System.out.println(p);
            return;
        }

        for(int i=1; i<=target;i++){
            totalCombinations(p+i, target-i);
        }
    }

    static int combinationCount(String p, int target){
        if(target==0){
            return 1;
        }
        int count=0;
        for(int i=1; i<=target;i++){
            count = count + combinationCount(p+i, target-i);
        }
        return count;
    }

    public static void main(String[] args) {
       int target=4;
       totalCombinations("", target); 
    //    System.out.println(combinationCount("", target));
    }
}
