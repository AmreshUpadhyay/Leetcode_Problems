class Solution {
    public int missingMultiple(int[] nums, int k) {
        return multiple(nums , k);
    }
    static int multiple(int[]arr,int k){
        int multiples = k;
        HashSet <Integer> nums = new HashSet<>();
        for(int num : arr){
            nums.add(num);
        }
        for(int num : nums){
            if(nums.contains(multiples)){
                multiples += k;
            }
            else{
                return multiples;
            }
        }
        return multiples;
    }
}