class Solution {
    public int maxSubArray(int[] nums) {
        return solution(nums);
    }
    static int solution(int[]arr){
        int maxsum = Integer.MIN_VALUE;
        int sum = 0 ; 
        for(int i = 0 ; i < arr.length ; i++){
            sum += arr[i];
            maxsum = sum>maxsum?sum:maxsum;
            sum = sum<0?0:sum;
        }
        return maxsum;
    }
}