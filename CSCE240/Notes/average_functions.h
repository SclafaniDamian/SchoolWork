// Copyright 2022 CSCE240-003
#ifndef _AVERAGE_FUNCTIONS_H_
#define _AVERAGE_FUNCTIONS_H_

// function to compute the average of three doubles
// preconditions: function is sent three double value arguments
// postcondition: function returns the sum of the three values
//                divided by 3
double Average(double x, double y, double z = 0);

// function to compute the average of two characters
// preconditions: function is sent two character values as arguments
// postcondition: funciton returns the average of those characters
char Average(char c1, char c2);

#endif  // _AVERAGE_FUNCTIONS_H