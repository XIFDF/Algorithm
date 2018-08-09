public class Solution {
    /**
     * @param nums: A set of numbers
     * @return: A list of lists
     */
    public List<List<Integer>> subsets(int[] nums) {
        // write your code here
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        if (nums.length > 0) {
    		for (int i = 0; i < Math.pow(2, nums.length); i++) {// 集合子集个数=2的该集合长度的乘方
				ArrayList<Integer> subSet = new ArrayList<Integer>();
				int index = i;// 索引从0一直到2的集合长度的乘方-1
				for (int j = 0; j < nums.length; j++) {
					// 通过逐一位移，判断索引那一位是1，如果是，再添加此项
					if ((index & 1) == 1) {// 位与运算，判断最后一位是否为1
						subSet.add(nums[j]);
					}
					index >>= 1;// 索引右移一位
				}
				result.add(subSet); // 把子集存储起来
			}
			return result;
		} else {
		    result.add(new ArrayList<>());
			return result;
		}
    }
}