class Solution {
    public void rotate(int[] nums, int k) {
        rotater(nums , k);
    }
    static void rotater(int[]arr , int k){
        if(k>arr.length){
            k = k % arr.length;
        }
        reverse(arr,arr.length-k,arr.length-1);
        reverse(arr,0,arr.length-k-1);
        reverse(arr,0,arr.length-1);
    }
    static void reverse(int[]arr , int i , int j){
        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }
    static void swap(int[]arr , int a , int b){
        int temp = arr[a];
        arr[a] =arr[b];
        arr[b] = temp;
    }
}