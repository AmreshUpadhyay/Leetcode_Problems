class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        return count(nums);
    }
    static int count(int[]arr){
        int count =0;
        int prev =0;
        int i =0;
        while(i<arr.length){
            if(arr[i]==1){
                count++;
            if(count > prev){
            prev = count;
            }
                i++;
            }
            else{
                count =0;
                i++;
            }
        }
        return prev;
    }
}