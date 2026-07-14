class Solution {
    public int[] sortArray(int[] nums) {
       quickSort(nums,0,nums.length-1);
       return nums;
    }
    static void quickSort(int[]arr,int low,int high){
        if(low<high){
            int pi = partitionIndex(arr,low,high);
            quickSort(arr,low,pi-1);
            quickSort(arr,pi+1,high);
        }
    }
    static int partitionIndex(int[]arr , int low , int high){
        int random = low + (int)(Math.random() * (high - low + 1));
        swap(arr, low, random);
        int i = low;
        int j = high;
        int pivot = arr[low];
        while(i<j){
            while(i<high && arr[i]<=pivot){
                i++;
            }
            while(j>low && arr[j]>pivot){
                j--;
            }
            if(i<j){
                swap(arr,i,j);
            }
        }
        swap(arr,low,j);
        return j;
    }
    static void swap(int[]arr , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}