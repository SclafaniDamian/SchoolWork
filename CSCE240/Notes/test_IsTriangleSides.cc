// Copyright 2022 CSCE240
// unit tests for IsTriangleSides
#include<triangles.h>

#include<iostream>
using std::cout;
using std::endl;

// test good side values
// returns true if the function behaves as expected, false if it fails
bool TestGoodSideValues1() {
  return IsTriangleSides(3, 4, 5);
}

// returns true if the function behaves as expected, false if it fails
bool TestBadSideValues1() {
  return !IsTriangleSides(-1, 4, 6);
}

// returns true if the function behaves as expected, false if it fails
bool TestBadSideValues2() {
  return !IsTriangleSides(4, 4, 0);
}

// returns true if the function behaves as expected, false if it fails
bool TestBadSideValues3() {
  return !IsTriangleSides(3, 4, 1);
}

int main() {
  if ( TestGoodSideValues1() )
    cout << "Passed good test 1" << endl;
  else
    cout << "Failed good test 1" << endl;
  if ( TestBadSideValues1() )
    cout << "Passed bad test 1" << endl;
  else
    cout << "Failed bad test 1" << endl;
  if ( TestBadSideValues1() )
    cout << "Passed bad test 2" << endl;
  else
    cout << "Failed bad test 2" << endl;
  if ( TestBadSideValues3() )
    cout << "Passed bad test 3" << endl;
  else
    cout << "Failed bad test 3" << endl;
  return 0;
}