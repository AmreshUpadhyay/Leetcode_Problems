class Solution {
    public int maxProfit(int[] prices) {
        return profit(prices);
    }
    static int profit(int[]arr){
        int maxProfit = 0;
        int mini = arr[0];
        for(int i = 1; i<arr.length ; i++){
            if(arr[i]<mini){
                mini = arr[i];
            }
            int currentprofit = arr[i] - mini;
            if(currentprofit > maxProfit){
                maxProfit = currentprofit;
            }
        }
        return maxProfit;
    }
}