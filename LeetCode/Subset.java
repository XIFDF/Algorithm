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
    		for (int i = 0; i < Math.pow(2, nums.length); i++) {// �����Ӽ�����=2�ĸü��ϳ��ȵĳ˷�
				ArrayList<Integer> subSet = new ArrayList<Integer>();
				int index = i;// ������0һֱ��2�ļ��ϳ��ȵĳ˷�-1
				for (int j = 0; j < nums.length; j++) {
					// ͨ����һλ�ƣ��ж�������һλ��1������ǣ�����Ӵ���
					if ((index & 1) == 1) {// λ�����㣬�ж����һλ�Ƿ�Ϊ1
						subSet.add(nums[j]);
					}
					index >>= 1;// ��������һλ
				}
				result.add(subSet); // ���Ӽ��洢����
			}
			return result;
		} else {
		    result.add(new ArrayList<>());
			return result;
		}
    }
}