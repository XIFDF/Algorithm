/*����һ���������У��ҳ����к�Ϊ�ض�ֵ������������
 *����Լ���ÿ�����붼ֻ����һ�ִ𰸣�ͬ����Ԫ�ز��ܱ����á�

 ʾ�� :
 ���� nums = [2, 7, 11, 15], target = 9
 ��Ϊ nums[0] + nums[1] = 2 + 7 = 9
 ���Է���[0, 1]*/


class Solution {
public:
	vector<int> twoSum(vector<int>& nums, int target) {
		for (int i = 0; i < nums.size(); i++) {
			for (int j = i + 1; j < nums.size(); j++) {
				if (nums[i] + nums[j] == target) {
					vector<int> result{ i, j };
					return result;
				}
			}
		}
	}
};