// Copyright 2022 CSCE 240-003

#include<iostream>
using std::cout;	// standard output device
using std::cin;		// cin - object to obtain input
									// from the standard input device
using std::endl;	// flush the output buffer and
									// go to the next line
int main() {
	// declare a variable
	// type identifier
	// Google style - variables are all lowercase
	// with underscores between the words

	// arithmetic operators: *, /, %, +, -
	int money;
	double quarters;
	cout << "How much money (in cents)? ";
	cin >> money;
	cout << "You entered " << money << "\n";
	quarters = static_cast<double>(money) / 25;		// 25.0
	cout << "That's " << quarters << " quarters\n";

	return 0;
}