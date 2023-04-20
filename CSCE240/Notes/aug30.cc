// Copyright 2022 CSCE240-003
// Loops, calling library functions, and creating
// user-defined functions
#include<iostream>
#include<cmath>  // contains pow, sqrt, ceil, floor...
#include<cstdlib> // rand, srand
#include<ctime> // time
// prototype of a function is its structure
// return_type function_name(parameter_list);
// double pow(double, double);
using std::cout;
using std::cin;
using std::endl;
// to create function - we'll create a prototype
//                    - we'll implement the function

// function to return whether or not the character argument
// sent is alphabetic
bool IsAlphabetic(char a_character);
int main() {
  char some_character;
  cout << "Enter a character ";
  cin >> some_character;
  cout << some_character 
       << (IsAlphabetic(some_character)?" is ":" is not ")
       << "alphabetic\n";
  return 0;
}
// function implementation
bool IsAlphabetic(char a_character) {
  return (a_character >= 'a' && a_character <= 'z') ||
         (a_character >= 'A' && a_character <= 'Z');
}



/*
int main() {
  // prototype of this function is int rand();
  srand(time(0));
  cout << "RAND_MAX = " << RAND_MAX << endl;
  for(int i = 0; i < 10; ++i)
    cout << rand() % 100 << endl;
  return 0;
}
*/
/*
int main() {
  double base, exponent;
  cout << "Input a base ";
  cin >> base;
  cout << "Input an exponent ";
  cin >> exponent;
  cout << base << "^" << exponent << " = "
       << pow(base, exponent) << endl;
  return 0;
}
*/
/*  loops
int main() {
  //int y = 6;
  //cout << (y > 5 ? "3" : "2");
  
  // while, do/while, for
*/
/*  int x;
  do {
    cout << "input a positive integer ";
    cin >> x;
  } while (x<=0);
*/
/*  cout << "input a positive integer ";
  cin >> x;
  while (x<0) {
    cin >> x;    
  }
*/ 
//  int i = 1, j = 0;
/*  for (int i = 1, j = 0; i < 10; ++i, j += 2) {
    cout << "i = " << i << " and j = " << j << endl;
  }
  cout << "After the loop finishes i = " << i
       << " and j = " << j << endl;
  
  
  return 0;
}*/