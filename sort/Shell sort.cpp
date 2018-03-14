#include <iostream>
#include <vector>

using namespace std;

void shell_sort(vector<int> &array) {
	int size = array.size();
	if (size <= 1)
		return;
	for (int div = size / 2; div >= 1; div = div / 2){	//������div�������ϼ�С
		for (int i = 0; i <= div; ++i){					//�����div��
			for (int j = i; j < size - div; j += div)	//��ÿ����в�������
				for (int k = j; k < size; k += div)
					if (array[j] > array[k])
						swap(array[j], array[k]);		//������������ֵ
		}
	}
}

int main() {
	vector<int> array = { 64, 45, 34, 90, 12, 5, 33, 65 };
	shell_sort(array);
	for (auto a : array) {
		cout << a << " ";
	}
	cout << endl;
	int i;
	cin >> i;
	return 0;
}