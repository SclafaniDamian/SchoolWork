// Copyright 2022 bhipp
// 9/20/22 - arrays
#include<iostream>
using std::cout;
using std::cin;
using std::endl;
#include<iomanip>  // for setw
#include<cstdlib>  // for rand, srand
#include<ctime>    // for time

// since this function is actually modifying values in the array that we
// send, we leave off the const qualifier
void populate(int myarray[], const int num_elements) {
  for ( int i = 0; i < num_elements; ++i )
    myarray[i] = rand() % 100;
}


// formal array parameters are followed by an empty set of square brackets
// if the function doesn't modify the values in the array, put the const
// qualifier on the array parameter
void print(const int myarray[], const int num_elements) {
  for ( int i = 0; i < num_elements; ++i )
    cout << myarray[i] << " ";
  cout << endl;
}

// for a multi-dimensional array parameter, the first [] is blank, but the
// remaining [] must contain sizes
const int kColumns = 6;
void print(const int bigarray[][kColumns], const int num_rows) {
  for ( int i = 0; i < num_rows; ++i ) {
    for ( int j = 0; j < kColumns; ++j ) {
      cout << std::setw(5) << bigarray[i][j];
    }
    cout << endl;
  }
}



int main() {
  srand(time(0));
  const int kSize = 18;
  // declare an array - type identfier[size]
  int numbers[kSize] = { 3, 6, 7 };  // you can initialize the values in {}
                                 // with the declaration
  // numbers = { 1, 3, 4}; // arrays can only be initialized when declared
  print(numbers, 3);
  populate(numbers, kSize);
  print(numbers, kSize);

  int two_dimensions[3][kColumns] = { { 1, 2}, { 7 } , { 10, 20, 30 } };
  print(two_dimensions, 3);
  // cout << two_dimensions[0][14] << endl;
/*	double reals[kSize] = { 0.1, 0.12 };
  // cout << numbers << endl;  // the name of the array gives the memory location
  // of thae first element in the array
  // cout << numbers + 1 << endl;
  // cout << reals << endl;
  // cout << reals + 1 << endl;
  for ( int i = 0; i < kSize; ++i )
    cout << numbers[i] << " ";
  cout << endl;
	char charstring[kSize] = "abc"; // { 'a', 'b', 'c' }; 
	cout << charstring << endl;
*/
  return 0;
}