// Copyright 2022 Damian Sclafani CSCE240-003
#include<operator_functions.h>
#include<iostream>
#include<string>
using namespace std;

bool IsInteger(double num1) {
	int num = num1;
	if (num == num1) {
		return true;
	}
	else {
		return false;
	}
}

bool IsArithmeticOperator(char sym1) {
  if ((sym1 == '+') || (sym1 == '-') || (sym1 == '*')
      || (sym1 == '/') || (sym1 == '%')) {
				return true;
	}
	else {
		return false;
	}
}

string OperatorToWords(char sym1) {
	if (sym1 == '+') {
		return "plus";
	}
	else if (sym1 == '-') {
		return "minus";
	}
	else if (sym1 == '*') {
		return "times";
	}
	else if (sym1 == '/') {
		return "divided by";
	}
	else if (sym1 == '%') {
		return "modulo";
	}
	else {
		return "??";
	}
}

bool Compute(double num1, char sym1, double num2, double answer) {
	if (sym1 == '+') {
		answer = num1 + num2;
		return true;
	}
	else if (sym1 == '-') {
		answer = num1 - num2;
		return true;
	}
	else if (sym1 == '*') {
		answer = num1 * num2;
		return true;
	}
	else if (sym1 == '/') {
		answer = num1 / num2;
		return true;
	}
	else if (sym1 == '%') {
		answer = (int)num1 % (int)num2;
		return true;
	}
	else {
		return false;
	}
}