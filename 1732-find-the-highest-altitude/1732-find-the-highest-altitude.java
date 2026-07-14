class Solution {
    public int largestAltitude(int[] gain) {
        return altitude(gain);
    }
    static int altitude(int[] arr){
        int current  = 0 ;
        int max = 0;
        int i = 0;
        while(i<arr.length){
            current = current+arr[i++];
            max = Math.max(max,current);
        }
        return max;
    }
}