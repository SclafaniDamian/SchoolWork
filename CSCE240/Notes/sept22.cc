// Copyright 2022 CSCE240-003 bhipp
// more with arrays
#include<iostream>
using std::cin;
using std::cout;
using std::endl;
#include<string>
using std::string;
#include<iomanip>
using std::setw;

// linear search an array of strings
// preconditions: take an array of strings to search, the size of the array
//                and a search value as parameters
// postconditions: parameters will remain unchanged, returns the position of
//                 the search value in the array or -1 if the search value is
//                 not in the array
int LinearSearch(const string s_array[], int size, string search_value) {
  int position = -1, i = 0;
  while ( position == -1 && i < size ) {
    if ( s_array[i] == search_value )
      position = i;
    ++i;
  }
  return position;
}


// selection sort for an array of strings and a parallel array of doubles
// preconditions: the function is sent an array of strings and an array of
//                doubles that are the same size, and s[i] corresponds to
//                p[i] for all i
// postconditions: the arrays will be sorted in ascending order by the values
//                 in the array of strings
//                 the two arrays will remain parallel, with s[i] corresponding
//                 to p[i]
void SelectionSort(string s[], double p[], int size) {
  for ( int fixin = 0; fixin < size; ++fixin ) {
    int small_position = fixin;
    for ( int i = fixin + 1; i < size; ++i )
      if ( s[i] < s[small_position] )
        small_position = i;
    string temp = s[small_position];
    s[small_position] = s[fixin];
    s[fixin] = temp;
    // move the prices as well to keep them connected to their associated
    // item name
    double tempd = p[small_position];
    p[small_position] = p[fixin];
    p[fixin] = tempd;
  }
}

// print strings in fields of size 15
void Print(const string s[], int size) {
  for ( int i = 0; i < size; ++i )
    cout << setw(15) << s[i];
  cout << endl;
}

// print doubles in fields of size 15
void Print(const double p[], int size) {
  for ( int i = 0; i < size; ++i )
    cout << setw(15) << p[i];
  cout << endl;
}

// function to convert all of the characters in a string to lowercase
void Lowerize(string& s) {
  for ( unsigned long int i = 0; i < s.length(); ++i )
    s[i] = tolower(s[i]);
}


int main() {
  const int kArraySize = 10;
  // create and array of strings holding item names
  string item[kArraySize] = { "appLes", "strawberries", "rasPberries",
                              "blackBerries", "kiwi", "Mango", "Pineapple",
                              "grapes", "tomatoes", "orangeS" };
  double price[kArraySize] = { 3.37, 4.51, 5.01, 6.12, 4.08, 5.01, 6.13, 3.45,
                               5.10, 5.76 };
  Print(item, kArraySize);
  Print(price, kArraySize);
  for ( int i = 0; i < kArraySize; ++i )
    Lowerize(item[i]);
//  Print(item, kArraySize);
  string lookin4;
  cout << "What are looking for? ";
  cin >> lookin4;

  int found_position = LinearSearch(item, kArraySize, lookin4);
  if ( found_position == -1 )
    cout << "We don't have any" << endl;
  else
    cout << item[found_position] << " costs " << price[found_position] << endl;

  // keep the items and prices in the same corresponding positions
  SelectionSort(item, price, kArraySize);

  Print(item, kArraySize);
  Print(price, kArraySize);

  return 0;
}