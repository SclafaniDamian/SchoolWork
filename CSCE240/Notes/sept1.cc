// Copyright 2022 Damian CSCE240-003
// creating user-defined functions (chapters 3 & 4)
#include<cmath>  // pow, ceil, floor
#include<iostream>
using std::cin;
using std::cout;
using std::endl;
// User-defined function to take a decimal number and
// round to a particular decimal place
// preconditions = expectation for state prior to function call
// preconditions = arguments will be a valid double, and
//                 a positive integer for the number of places
//                 to round after the decimal
// postconditions = state once the function completes
// postconditions = return a the equivalent of the first
//                  argument rounded to the specified number
//                  of digits
double RoundTo(double num, int digits);
// function that converts a temperature from Fahrenheit
// to Celsius
// precondition = function is sent a decimal value
//                representing a Fahrenheit temperature
// postcondition = function returns a decimal value
//                 that is the Celsius equivalent of that
//                 Fahrenheit temperature
double FahrenheitToCelcius(double fahrenheit);
// function to convert a measure in miles to kilometers
// preconditon = send a reference to a double variable
//               representing a distance in miles
// postcondition = the variable sent to the function will
//                 be changed to the equivalent kilometer
//                 measure of the distance
const double kKilometersInAMile = 1.609344;
void ConvertToKm(double& distance) {
    distance *= kKilometersInAMile;
}
int main() {
  double dist;
  cout << "Enter a distance in miles ";
  cin >> dist;
  ConvertToKm(dist);
  cout << "After the function call, dist = " << dist << endl;

/*  double tempF;
  cout << "Enter a temperature in degrees Fahrenheit ";
  cin >> tempF;
  double tempC = FahrenheitToCelcius(tempF);
  cout << tempF << " is equivalent to " << tempC
       << " degress Celsius" << endl;  */

/*  double decimal_number;
  int decimal_places;
  cout << "Enter a decimal number ";
  cin >> decimal_number;
  cout << "How many decimal places would you like to roudn to? ";
  cin >> decimal_places;
  cout << RoundTo(decimal_number, decimal_places) << endl;
//  cout << RoundTo(1.23456, 2);  */
  return 0;
}
double FahrenheitToCelsius(double fahrenheit) {
    fahrenheit = (fahrenheit - 32) * 5.0 / 9;
    return fahrenheit;
}
double RoundTo(double num, int digits) {
// ex 1.23456 2     1.23456 3
//    123.456       1234.56
//    123.956       1235.06
//    123           1235
  return static_cast<int>(num * pow(10, digits) + 0.5) 
                            / pow(10,digits);
}