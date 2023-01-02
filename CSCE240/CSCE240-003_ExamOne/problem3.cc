// Copyright 2022 Damian Sclafani CSCE240-003
#include<problem3.h>
#include<iostream>
using std::cout;
using std::endl;
using std::cin;

int main() {
	int test_num1;
	cin >> test_num1;
	cout << Reverse(test_num1);

	int test_num2;
	int test_param2;
	cin >> test_num2 >> test_param2;
	cout << Reverse(test_num2, test_param2);

	int test_num3;
	int test_param3;
	cin >> test_num3 >> test_param3;
	cout << MatchWithReverseDigits(test_num3, test_param3);
  return 0;
}

int Reverse(int num) {
	int rnum = 0;
	int remainder = 0;
	while (num != 0) {
		remainder = num % 10;
		rnum = rnum * 10 + remainder;
		num /= 10;
	}
	return rnum;
}

int Reverse(int num, int param) {
	int rnum = 0;
	int remainder = 0;
	int counter = 0;
	if (param < 0) {
		return num;
	}
	for (int i = 0; i < param; i++) {
		remainder = num % 10;
		rnum = rnum * 10 + remainder;
		num /= 10;
		counter++;
	}
	for (int j = 0; j < counter; j++) {
		num *= 10;
	}
	return num + rnum;
}

int MatchWithReverseDigits(int num, int param) {
	int rnum = 0;
	int remainder = 0;
	int counter = 0;
	if (num == param) {
		return 0;
	}
	while ((num != 0) || (rnum != param)) {
		remainder = num % 10;
		rnum = rnum * 10 + remainder;
		num /= 10;
		counter++;
	}
	if (rnum != param) {
		return -1;
	}
	return counter;
}