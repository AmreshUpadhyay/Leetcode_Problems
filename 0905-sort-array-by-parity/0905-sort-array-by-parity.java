class Solution {
    public int[] sortArrayByParity(int[] nums) {
        sort(nums);
        return nums;
    }
    static void sort(int[]arr){
        int l = 0;
        int r = arr.length-1;
        int i = 0;
        while(l<=r){
            if(arr[l]%2==0){
                l++;
            }
            else if(arr[r]%2==1){
                r--;
            }
            else{
                swap(arr,l,r);
                l++;
                r--;
            }
        }
    }
    static void swap(int[]arr , int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}