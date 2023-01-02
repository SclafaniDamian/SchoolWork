// Copyright 2022 CSCE240-003
// call our average functions
#include<average_functions.h>
#include<iostream>
using std::cout;
using std::cin;
using std::endl;

int main() {
  double num1, num2, num3;
  char x, y;
  cout << "Enter three numbers: ";
  cin >> num1 >> num2 >> num3;
  cout << Average(num1, num2) << endl;
  cout << Average(num1, num2, num3) << endl;
  cout << "Enter two characters ";
  cin >> x >> y;
  cout << Average(x, y) << endl;
  return 0;
}