public class D10_StockBuy {
 
    public int maxProfit(int[] prices) {
        // [7,1,5,3,6,4]

        // min = 1
        // maxProfit = 5
        int min = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int n:prices){
            min = Math.min(min, n);
            maxProfit = Math.max(maxProfit, n - min);
        }
        return maxProfit;
    }

    public int maxProfit2(int[] prices) {
        int min = Integer.MAX_VALUE;
        int minIndex = -1;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<min){
                min = prices[i];
                minIndex = i;
            }
        }
        int max = 0;
        int maxIndex = minIndex;
        for(int i=maxIndex;i<prices.length;i++){
            if(prices[i]>max){
                max = prices[i];
                // maxIndex = i;
            }
        }

        if(max == 0){
            return 0;
        } else {
            return max - min;
        }
    }
}

