class Solution {
    public int maxScore(int[] cardPoints, int k) {
        return max(cardPoints , k);
    }
    static int max(int[]arr , int k){
        int leftSum = 0;
        int rightSum = 0;
        int l = 0;
        int r = k-1;
        int maxSum = Integer.MIN_VALUE;
        for(int i =0; i < k ; i++){
            leftSum = leftSum + arr[i];
        }
        maxSum = leftSum;
        int rindex = arr.length-1;
        for(int i = k-1;i>=0;i--){
            leftSum = leftSum - arr[i];
            rightSum = rightSum + arr[rindex];
            maxSum = Math.max(maxSum , leftSum+rightSum);
            rindex--;
        }
        return maxSum;
    }
}