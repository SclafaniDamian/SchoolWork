// Copyright 2022 CSCE240-003 bhipp
// Introduction to Pointers in C++
#include<iostream>
using std::cout;
using std::cin;
using std::endl;

int main() {
  // an array of pointers - the individual pointers can point to blocks
  // of different sizes
  int * array_of_pointers[3];
  array_of_pointers[0] = new int[3];
  array_of_pointers[1] = new int[2];
  array_of_pointers[2] = new int[5];

  array_of_pointers[0][0] = 6;
  array_of_pointers[0][1] = 10;
  array_of_pointers[0][2] = 7;

  for ( int i = 0; i < 3; ++i )
    cout << array_of_pointers[0][i] << " ";
  cout << endl;
  return 0;
}

/*
int main() {
  int * my_pointer;
  int how_much;
  do {
    cout << "How many integers do you need? ";
    cin >> how_much;
  } while ( how_much < 1 || how_much > 10000 );

  // new will reserve memory for our use and return its address
  my_pointer = new int[how_much];
  // delete frees up dynamically allocated memory
  cout << my_pointer << endl;
  // NULL = 0,  nullptr (null value for a pointer variable, not to be confused
  //                     with a numeric 0)
  if ( my_pointer == NULL ) {
    cout << "Couldn't allocate " << how_much << " integers";
    exit(1);
  }
  // NULL

  cout << "Enter " << how_much << " integer\n";
  for ( int i = 0; i < how_much; ++i )
    cin >> my_pointer[i];  // we can use the [] operator with pointers
                           // just like we did with arrays

  for ( int i = 0; i < how_much; ++i )
    cout << my_pointer[i] << " ";  // we can use the [] operator with pointers
                                   // just like we did with arrays

  delete [] my_pointer;  // delete pointer frees up space that pointer is
                         // pointing
                         // delete [] pointer frees up an array / block of mem
                         // the pointer is pointing to
                         // - need to free up the space or make
                         // pointer keep track of where that is before
                         // moving our pointer elsewhere

   // freeing the memory does not get rid of the pointer!!!!!
//  cout << *my_pointer << endl;
//  my_pointer = nullptr; // after deleting, set your pointer to either nullptr
  //my_pointer = new int [100]; // or some other meaningful location
  return 0;
}
*/
/*
int main() {
  // this declares a_pointer as a pointer to an integers
  // and an_integer as an integer
  int *a_pointer, an_integer;
	
  an_integer = 8;
  a_pointer = &an_integer;  // & reference operator returns the address of
                            // a variable
  cout << "a_pointer = " << a_pointer << "\n*a_pointer = " << *a_pointer
       << endl;

  cout << "&a_pointer = " << &a_pointer << endl;
  const int kSize = 10;
	int numbers[kSize] = { 1, 44, 32, 68, 100 };

  cout << numbers << endl;
  a_pointer = numbers;  // numbers holds the address of the first element
                        // in the array
  for ( int i = 0; i < kSize; ++i, ++a_pointer )
      cout << *a_pointer << " ";
//    cout << *(numbers + i) << " ";
//    cout << numbers[i] << " ";
  cout << endl;

  return 0;
} */