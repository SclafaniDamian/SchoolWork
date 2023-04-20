// Copyright 2022 CSCE240-003 Damian Sclafani
#ifndef _PROBLEM1_H_
#define _PROBLEM1_H_

#include<iostream>
using std::cout;
using std::endl;
using std::ostream;

// Finds all instances of a value and replaces it with a new value
template<class T>
void FindAndReplace(T array[], int size, T value, T replace) {
  for (int i = 0; i < size; i++) {
    if (array[i] == value) {
      array[i] = replace;
    }
  }
}

#endif  // _PROBLEM1_H_
