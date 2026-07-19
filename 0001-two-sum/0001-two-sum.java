class Solution {
    public int[] twoSum(int[] nums, int target) {
          Map<Integer, Integer> map = new HashMap<>();
        int j = nums.length-1;
        int i = 0;

        while( i<=j ){
            if (!map.containsKey(target - nums[i])){
                map.put(nums[i], i);
                i++;
            }else{
                return new int[] {i, map.get(target-nums[i])};
            }

            if(!map.containsKey(target - nums[j])){
                map.put(nums[j], j);
                j--;
            }else{
                return new int[]{j, map.get(target-nums[j])};
            }
        }
        return null;
    }
}