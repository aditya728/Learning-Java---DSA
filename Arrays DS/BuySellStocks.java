public class BuySellStocks {

    public static int stockProfit(int price[]){
        int maxProfit = 0;
        int buyPrice = Integer.MAX_VALUE;
        
        for(int i =0; i<price.length; i++){
            if(buyPrice < price[i]){
                int profit = price[i] -  buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            }
            else{
                buyPrice = price[i];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int prices[] = {3,7,2,9,1,4};
        System.out.println(stockProfit(prices));
    }
}

