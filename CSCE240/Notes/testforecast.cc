// Copyright 2022 CSCE240-003 bhipp
// test the forecast class
#include<forecast.h>
#include<temp.h>
#include<iostream>
using std::cout;

int main() {
  Temp::SetDegreeSymbolOrWord(2);  // calling the static function for the
                                   // Temp class that changes how all Temp
                                   // objects display
  Forecast today;  // this calls the default constructor for today

  // this calls our second constructor with two Temp objects and a double
  Forecast tomorrow(Temp(40, "Fahrenheit"), Temp(60, "Fahrenheit"), 50);

  today.Print();
  today.SetLow(Temp(50, "Fahrenheit"));
  today.SetHigh(Temp(45, "Fahrenheit"));
  today.Print();
  tomorrow.Print();
  return 0;
}