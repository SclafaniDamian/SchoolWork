// Copyright 2022 CSCE240
// Exam 2 problem1.cc
#include"problem1.h"
#include<iostream>
// implement the Remove function here
void Remove(int an_array[], int array_size, int to_remove) {
  for (int i = 0; i < array_size; i++) {  // searches the array
    if (an_array[i] == to_remove) {   // checks if the value is to be removed
      an_array[i] = 0;   // removes the value by making it a 0
    }
  }
  // Goes through the array again to shift all values
  for (int i = 0; i < array_size; i++) {
    if (an_array[i] == 0) {
      for (int j = i; j < (array_size - 1); j++) {
        an_array[j] = an_array[j+1];  // shifts all values over
      }
      an_array[array_size] = 0;   // sets the last value to a 0
    }
  }
}
