// Copyright 2022 Damian Sclafani CSCE240-003

#include<iostream>
#include<cmath>;
using std::cout;
using std::cin;
using std::endl;

int main() {
	// declaring variables
	int number;
	int base;
	// User inputs values for the two variables
	cout << "enter a positive integer";
	cin >> number;
	cout << "enter the base";
	cin >> base;
	// declaring more variables
	int answer = 0;
	int counter = 0;
	int temp = number;
	int temp1 = 0;
	int digit;
	// Checks if base is valid
	if ((base >= 2) && (base <= 9)) {
		// Binary
		if (base == 2) {
			if (number >= 10) {
				while (temp > 0) {
					digit = temp % 10;
					temp /= 10;
					counter++;
				}
				// calculate exponent
				temp1 = counter;
				// calculation
				while (number > 0) {
					digit = number % 10;	// gets digits backwards
					// Checks that the numbers are in 1's and 0's
					if ((digit != 0) && (digit != 1)) {
						cout << "Invalid digit(s)!!!" << endl;
						answer = 0;  // sets answer to 0 because of error
						break;
					}
					else {
						// Calculates (backwards)
						while (counter > 0) {
							answer = answer + (digit * pow(base, (temp1 - counter)));
							counter--;
							break;
						}
					}
					// Goes to next digit
					number /= 10;
				}
				// print out the answer (as long as no errors occured)
				if (answer != 0) {
					cout << answer << endl;
				}
				else {
					if ((number != 0) && (number != 1)) {  //checks for single digits
						cout << "Invalid digit(s)!!!" << endl;
					}
					else {
						cout << number << endl;
					}
				}
			}
			// Non-binary (base 3-9)
			else {
				if (number >= 10) {
					while (temp > 0) {
						digit = temp % 10;
						temp /= 10;
						counter++;
					}
					temp1 = counter;
					while (number > 0) {
						digit = number % 10;
						while (counter > 0) {
							answer = answer + (digit * pow(base, (temp1 - counter)));
							counter--;
							break;
						}
						number /= 10;
					}
					if (answer != 0) {
						cout << answer << endl;
					}
				}
				// if number is negative
				else if (number < 0) {
					// Turns value to positive
					temp = number = (-1 * number);
					// Continues calculations normally
					while (temp > 0) {
						digit = temp % 10;
						temp /= 10;
						counter++;
					}
					temp1 = counter;
					while (number > 0) {
						digit = number % 10;
						while (counter > 0) {
							answer = answer + (digit * pow(base, (temp1 - counter)));
							counter--;
							break;
						}
						number /= 10;
					}
					// changes value back to negative
					if (answer != 0) {
						cout << (-1 * answer) << endl;
					}
				}
			}
		}
	}
	// if base is invalid (not 2-9)
	else {
		cout << "Base not accepted" << endl;
	}
	return 0;
}