class Solution {
    public int[] sortedSquares(int[] nums) {
        square(nums);
        return nums;
    }
    static void square(int[]nums){
        for(int i = 0 ; i < nums.length ; i++){
            nums[i] = nums[i]*nums[i];
        }
        mergeSorting(nums,0,nums.length-1);
    }
     static void mergeSorting(int[]arr , int low , int high){
        if(low==high) return;
        int mid = low + (high - low)/2;
        mergeSorting(arr,low,mid);
        mergeSorting(arr,mid+1,high);
        merge(arr,low,mid,high);
    }
    static void merge(int[] arr , int low ,int mid, int high){
        int n = arr.length;
        int j = 0;
        int[] temp = new int[n];
        int right = mid + 1;
        int left = low;
        while(left <= mid && right <=high){
            if(arr[left] <= arr[right]){
                temp[j] = arr[left];
                j++;
                left++;
            }
            else{
                temp[j] = arr[right];
                right++;
                j++;
            }
        }
        while(left<=mid){
            temp[j] = arr[left];
            left++;
            j++;
        }
        while(right<=high){
            temp[j] = arr[right];
            right++;
            j++;
        }
        for(int i = low; i <= high; i++){
            arr[i] = temp[i - low];
        }
    }
}