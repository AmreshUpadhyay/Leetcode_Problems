class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        return sortII(nums);
    }
    static int[] sortII(int[]arr){
        int[]ans= new int[arr.length];
        int e = 0; 
        int o = 1;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i]%2==0){
                ans[e] = arr[i];
                e = e+2;
            }
            else{
                ans[o] = arr[i];
                o = o+2;
            }
        }
        return ans;
    }
}