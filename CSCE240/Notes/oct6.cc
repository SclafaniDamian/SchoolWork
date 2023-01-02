// Copyright 2022 CSCE240-003 bhipp
// driver 10/06/2022 - more operator overloading, static members,
//                     objects as data members
#include<temp.h>
#include<iostream>
using std::cout;
using std::cin;
using std::endl;

int main() {
  Temp i(9, "Fahrenheit"), j(88, "Celsius"), k(4, "Kelvin");
//  cout << "Enter a temperature ";
//  cin >> i;
  // static member functions can be called on the class (note: non-static
  // cannot)
  cout << i << "\n" << j << "\n" << k << endl;
  Temp::SetDegreeSymbolOrWord(2);

  cout << i << "\n" << j << "\n" << k << endl;
/*  cout << i << endl;  // 9
  cout << ++i << endl; // 10
  cout << i << endl;   // 10
  cout << i++ << endl; // 10
  cout << i << endl;   // 11
*/
  return 0;
}