class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        mergeSort(nums1,m,nums2,n);
    }
    static void mergeSort(int[] arr, int m, int[] nums, int n) {

        int[] temp = new int[m + n];

        int a = 0, b = 0, j = 0;

        while (a < m && b < n) {
            if (arr[a] <= nums[b]) {
                temp[j++] = arr[a++];
            } else {
                temp[j++] = nums[b++];
            }
        }

        while (a < m) {
            temp[j++] = arr[a++];
        }

        while (b < n) {
            temp[j++] = nums[b++];
        }

        for (int i = 0; i < m + n; i++) {
            arr[i] = temp[i];
        }
    }
}