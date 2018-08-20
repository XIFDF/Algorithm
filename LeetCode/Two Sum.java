/*给定一个整数数组和一个目标值，找出数组中和为目标值的两个数。
你可以假设每个输入只对应一种答案，且同样的元素不能被重复利用。

示例:
给定 nums = [2, 7, 11, 15], target = 9

因为 nums[0] + nums[1] = 2 + 7 = 9
所以返回 [0, 1]
*/

class Solution {
    //利用哈希表(一次：在向哈希表插入元素的同时检测是否存在与之满足条件的元素)
    //时间复杂度：O(n) 空间复杂度：O(n)
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
    //暴力解法 
    //时间复杂度：O(n^2) 空间复杂度：O(1)
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
