class Solution {
    public void sortColors(int[] nums) {
        sort(nums);
    }
    static void sort(int[] nums){
        int n = nums.length;
        int a = 0 ; 
        int b = n-1;
        int i = 0;
        while(i<=b){
            if(nums[i]==0){
                swap(nums,i,a);
                i++;
                a++;
            }
            else if(nums[i]==2){
                swap(nums,i,b);
                b--;
            }
            else{
                i++;
            }
        }
    }
    static void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}