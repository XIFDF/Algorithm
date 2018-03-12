/*******************************/
/*快速排序  时间复杂度：O(nlogn) */
/*******************************/
#include <iostream>
#include <vector>

using namespace std;

void Qsort(vector<int> &array, int begin, int end) {
	if (begin >= end) { return; }
	int first = begin, last = end, key = array[first];
	while (first < last)
	{
		while (first < last && key <= array[last]) { 
			--last; 
		}
		array[first] = array[last];
		while (first < last && key >= array[first]) { 
			++first; 
		}
		array[last] = array[first];
	}
	array[first] = key;				//此时first已经改变, 标识到位
	Qsort(array, begin, first - 1);
	Qsort(array, last + 1, end);	//减一加一操作是为了不操作已到位的标识
}

int main(){
	vector<int> array = {64, 45, 34, 90, 12, 5, 33, 65};
	Qsort(array, 0, array.size() - 1);
	for (auto a : array) {
		cout << a << " ";
	}
	cout << endl;
	int i;
	cin >> i;
	return 0;
}
