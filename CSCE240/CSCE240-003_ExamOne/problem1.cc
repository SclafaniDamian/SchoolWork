// Copyright 2022 Damian Sclafani CSCE240-003
#include<iostream>
#include<cmath>
using std::cout;
using std::cin;
using std::abs;

int main() {
	int num1;
	int num2;
	int help_num;
	cin >> num1 >> num2;

	if (num1 % num2 == 0) {
		help_num = num1 / num2;
		cout << num1 << " is " << help_num << " times " << num2;
	}
	else if (num2 % num1 == 0) {
		help_num = num2 / num1;
		cout << num2 << " is " << help_num << " times " << num1;
	}
	else {
		if (abs(num1) > abs(num2)) {
			cout << num1 << " is not a multiple of " << num2;
		}
		else {
			cout << num2 << " is not a multiple of " << num1;
		}
	}
	return 0;
}