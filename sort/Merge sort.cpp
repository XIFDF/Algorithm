#include <iostream>
#include <vector>

using namespace std;

vector<int> merge_sort(vector<int> array) {
	int size = array.size();
	if (size < 2) return array;

	vector<int> left, right, result;
	left.assign(array.begin(), array.begin() + size / 2);
	right.assign(array.begin() + size / 2, array.end());

	left = merge_sort(left);
	right = merge_sort(right);

	while (left.size() > 0 && right.size() > 0) {
		if (left.front() < right.front()) {
			result.push_back(left.front());
			left.erase(left.begin());
		}
		else {
			result.push_back(right.front());
			right.erase(right.begin());
		}
	}
	while (left.size()) {
		result.push_back(left.front());
		left.erase(left.begin());
	}
	while (right.size()) {
		result.push_back(right.front());
		right.erase(right.begin());
	}
	return result;
}

int main() {
	vector<int> array = { 64, 45, 34, 90, 12, 5, 33, 65 };
	array = merge_sort(array);
	for (auto a : array) {
		cout << a << " ";
	}
	cout << endl;
	int i;
	cin >> i;
	return 0;
}