// Copyright 2022 CSCE240-003
#include<average_functions.h>
#include<iostream>
using std::cout;
using std::endl;

// unit test for Average(double,double,double)
bool TestAverage1() {
  return Average(1.2, 1.5, 1.8) == 1.5;
}

int main() {
  if ( TestAverage1() )
    cout << "Passed TestAverage1" << endl;
  else
    cout << "Failed TestAverage1" << endl;
  return 0;
}