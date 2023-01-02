// Copyright 2022 CSCE240-003 bhipp
// testing Temp class 10/4
#include<temp.h>
#include<iostream>
using std::cout;
using std::cin;
using std::endl;

void WindChill(Temp t) {
  cout << t.GetValue() - 10 << endl;
}  // whenever this function exits the destructor is called for the parameter t

int main() {
  Temp t1(40, "Fahrenheit"), t2(4, "Celsius");

  if ( t1 > t2 )  // t1.operator >(t2)
    cout << t1 << " is greater than " << t2 << endl;
  else
    cout << t1 << " is not greater than " << t2 << endl;
  return 0;
}



/*
string initial_measure, new_measure;
  WindChill(static_cast<Temp>(63));
  cin >> initial_measure;
  {
    Temp a_temp(40, initial_measure);
  } // destructor is called for any objects created in this
  cout << initial_measure << endl;
  return 0;
}
*/

/*

int main() {
  // WindChill expects a Temp object
  WindChill(static_cast<Temp>(63));  // we have a Temp constructor that 
                                     // can take a double

  return 0;
}*/