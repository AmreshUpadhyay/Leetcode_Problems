class Solution {
    public int arrangeCoins(int n) {
        return arrangment(n);
    }
    static int arrangment(int n){
        long low = 1;
        long high = n;
        while(low<=high){
            long mid = low + (high - low)/2;
            long coins = mid*(mid+1)/2;
            if(n == coins){
                return (int)mid;
            }
            else if(n>coins){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return (int)high;
    }
}