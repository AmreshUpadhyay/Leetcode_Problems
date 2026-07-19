class Solution {
    public int[] twoSum(int[] nums, int target) {
        return solution(nums,target);
    }
    static int[] solution(int[]arr , int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0; i < arr.length ; i++){
            if(!map.containsKey(target-arr[i])){
                map.put(arr[i],i);
            }
            else{
                return new int[]{i , map.get(target-arr[i])};
            }
        }
        return null;
    }
}