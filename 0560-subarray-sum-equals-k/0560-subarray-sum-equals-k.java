class Solution {
    public int subarraySum(int[] nums, int k) {
        return solution(nums,k);
    }
    static int solution(int[] arr , int k){
        int n = arr.length ; 
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int sum = 0; 
        int count = 1;
        for(int num : arr){
            sum += num;
            if(map.containsKey(sum - k)){
                count += map.get(sum-k);
            }
            map.put(sum , map.getOrDefault(sum , 0)+1);
        }
        return count-1;
    }
}