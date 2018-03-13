/*********************************
 **选择排序  时间复杂度：O(n^2) ****
 *********************************/
#include <iostream>
#include <vector>

using namespace std;

void selection_sort(vector<int> &array) {
	for (int i = 0; i < array.size() - 1; ++i) {
		int minIndex = i;
		for (int j = i + 1; j < array.size(); ++j) {
			if (array[j] < array[minIndex]) {
				minIndex = j;
			}
		}
		swap(array[i], array[minIndex]);
	}
}


int main() {
	vector<int> array = { 64, 45, 34, 90, 12, 5, 33, 65 };
	selection_sort(array);
	for (auto a : array) {
		cout << a << " ";
	}
	cout << endl;
	int i;
	cin >> i;
	return 0;
}
