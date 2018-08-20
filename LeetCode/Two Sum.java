class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; ++i){
            int need = target - nums[i];
            if(map.containsKey(need)){
                return new int[] {map.get(need), i};
            }
            map.put(nums[i], i);
        }
        return new int[1];
    }
    public int[] twoSum2(int[] nums, int target) {
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[1];
    }
}