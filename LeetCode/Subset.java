/*给定一个含不同整数的集合，返回其所有的子集*/
/*子集中的元素排序必须是非降序的，解集必须不包含重复的子集*/
/*
如果 S = [1,2,3]，有如下的解
[
  [3],
  [1],
  [2],
  [1,2,3],
  [1,3],
  [2,3],
  [1,2],
  []
]
*/
public class Solution {
    /**
     * @param nums: A set of numbers
     * @return: A list of lists
     */
    public List<List<Integer>> subsets(int[] nums) {
        // write your code here
        Arrays.sort(nums);//排序保证非降序
        List<List<Integer>> result = new ArrayList<>();
        if (nums.length > 0) {
    		for (int i = 0; i < Math.pow(2, nums.length); i++) {// 集合子集个数为 2的该集合长度的乘方
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
/*上面迭代解法的核心，求子集的本质可看做二进制数00...00到11...11之间，一个二进制数看作一个子集
二进制数的位数为所求集合的长度，0的位可看作该元素不出现在该子集，1的位表示出现在该子集
*/
