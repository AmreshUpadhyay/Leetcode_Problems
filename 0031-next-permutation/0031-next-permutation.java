class Solution {
    public void nextPermutation(int[] nums) {
        order(nums);
    }
    static void order(int[]arr){
        int n = arr.length;
        int ind = -1;
        for(int i = n-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                ind = i;
                break;
            }
        }
        if (ind == -1) {
        reverse(arr, 0, n - 1);
        return;
        }
        for(int i = n - 1;i>ind;i--){
            if(arr[i]>arr[ind]){
                swap(arr,i,ind);
                break;
            }
        }
        reverse(arr,ind+1,n-1);
    }
    static void swap(int[]arr, int a , int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    static void reverse(int[]arr , int a , int b){
        while(a<b){
            swap(arr,a,b);
            a++;
            b--;
        }
    }
}