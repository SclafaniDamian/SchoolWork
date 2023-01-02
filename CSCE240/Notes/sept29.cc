// Copyright 2022 CSCE240 bhipp
// introduction to classes in C++
#include<temp.h>
#include<string>
using std::string;
#include<iostream>
using std::cout;
using std::cin;
using std::endl;



int main() {
  Temp t(70, "something"), t2(23), t3;  // t is an object of the Temp class
  t.Print();
  t2.Print();
  t3.Print();
  t.SetValue(63);
  t.SetMeasure("Fahrenheit");
  t.Print();
  return 0;
}