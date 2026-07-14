class Solution {
    public int singleNumber(int[] nums) {
        return xor(nums);
    }
    static int xor(int[]arr){
        int xo = 0;
        for(int i = 0 ; i < arr.length; i++){
            xo ^= arr[i];
        }
        return xo;
    }
}