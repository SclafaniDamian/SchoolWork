// Copyright 2022 CSCE240-003
// 2022-08-25 - arithmetic operators, boolean
// operators, decisions, case, loops
#include<iostream>
using std::cout;
using std::cin;
using std::endl;
using std::ios;  // for the ios flags below
int main() {
  // while loop
  int number, digits = 0;
  cout << "enter a positive integer ";
  cin >> number;
  while (number > 0) {
    int digit = number % 10;
    number /= 10;
    if ( digit == 0 )
      continue;
    ++digits;
  }
  cout << digits << endl;
/*
  char x;
  cin >> x;
  switch ( x ) {
    case 'a':
    case 'A':
      cout << "1";
      cout << "2\n";
      break;
    case 'b':
      cout << "3\n";
      cout << "4\n";
*/


/*  int height_feet, height_inches;
  cout << "enter your your height in feet and inches";
  cin >> height_feet >> height_inches;
  cout << "That's " << height_feet << " feet and "
       << height_inches << " inch"
       << ( height_inches == 1 ? "\n" : "es\n") ;

*/
/*  int x = 1, y = 1;
  //cout << ++x << "\n" << y++ << endl;
  if ( (++x < 0) & (++y > 0) )
    cout << "Evaluated to true" << endl;
  else {
    cout << "False!";
    cout << endl;
  }
    
  cout << x << "\n" << y << endl;
  // NOT = !, AND = &&, OR = ||
  // relational operators <, <=, >, >=, ==,!=
*/

/*  double x = 0.00000003;
  cout.setf(ios::fixed);
  cout.setf(ios::showpoint);
  cout.precision(10);
  cout << x << endl;
*/

/*  int x, y;
  cout << "Input two integers ";
  cin >> x >> y; 
  cout << " x / y = " << x / y << endl; 
  double feet;
  cout << "Enter your height in feet\n    ft\r";
  cin >> feet;
  cout << "You entererd " << feet << " ft" << endl;
  char letter1, letter2;
  cout << "Enter two characters ";
  cin >> letter1 >> letter2;
  cout << "I read " << letter1 << " " << letter2 << endl;*/
  return 0;
}