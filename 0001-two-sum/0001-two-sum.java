class Solution {
    public int[] twoSum(int[] nums, int target) {
          Map<Integer, Integer> map = new HashMap<>();
        int r = nums.length-1;
        int l = 0;

        while( l<=r ){
            if (!map.containsKey(target - nums[l])){
                map.put(nums[l], l);
                l++;
            }else{
                return new int[] {l, map.get(target-nums[l])};
            }

            if(!map.containsKey(target - nums[r])){
                map.put(nums[r], r);
                r--;
            }else{
                return new int[]{r, map.get(target-nums[r])};
            }
        }
        return null;
    }
}