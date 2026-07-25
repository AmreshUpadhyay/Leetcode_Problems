class Solution {
    public int[] rearrangeArray(int[] nums) {
        optimal(nums);
        return nums;
    }
    static void optimal(int[]arr){
        int[] ans = new int[arr.length];
        int n = 1;
        int p = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>0){
                ans[p] = arr[i];
                p = p + 2;
            }
            else{
                ans[n] = arr[i];
                n = n + 2;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ans[i];
        }
    }
}