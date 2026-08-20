class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int count = 1;
        int max = 1;
        int i = 1;
        if(nums.length==0){
            return 0;
        }
        while(i<nums.length){
            if(nums[i]==nums[i-1]+1){
                count++;
                i++;
                max = Math.max(max,count);
            }
            else if(nums[i]==nums[i-1]){
                i++;
            }
            else{
                count = 1;
                i++;
            }
        }
        return max;
    }
}