#include <iostream>
#include <vector>

using namespace std;

void insertion_sort(vector<int> &array) {
	for (int i = 1; i < array.size(); ++i) {
		int current = array[i];
		int j = i - 1;
		while (j >= 0 && array[j] > current) {
			array[j + 1] = array[j];
			--j;
		}
		array[j + 1] = current;
	}
}

int main() {
	vector<int> array = { 64, 45, 34, 90, 12, 5, 33, 65 };
	insertion_sort(array);
	for (auto a : array) {
		cout << a << " ";
	}
	cout << endl;
	int i;
	cin >> i;
	return 0;
}