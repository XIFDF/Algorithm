#include <iostream>
#include <vector>

using namespace std;

void bubble_sort(vector<int> &array) {
	bool signal = false;
	for (int i = 0; i < array.size() - 1; ++i) {
		signal = true;
		for (int j = 0; j < array.size() - 1 - i; ++j) {
			if (array[j] > array[j + 1]) {
				swap(array[j], array[j + 1]);
				signal = false;
			}
		}
		if (signal == true) { return; }
	}
}

int main() {
	vector<int> array = { 64, 45, 34, 90, 12, 5, 33, 65 };
	bubble_sort(array);
	for (auto a : array) {
		cout << a << " ";
	}
	cout << endl;
	int i;
	cin >> i;
	return 0;
}