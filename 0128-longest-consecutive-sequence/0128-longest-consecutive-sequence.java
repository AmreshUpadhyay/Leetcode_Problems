class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        HashSet<Integer>LC = new HashSet<>();
        for(int num : nums){
            LC.add(num);
        }
        int max =1;
        for(int num : LC){
            if(!LC.contains(num-1)){
                int count = 1;
                int current = num;
                while(LC.contains(current+1)){
                    count++;
                    current++;
                    max = Math.max(max,count);
                }
            }
        }
        return max;
    }
}