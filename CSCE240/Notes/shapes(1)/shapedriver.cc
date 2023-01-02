// Copyright 2022 CSCE240
// test drive our shapes
#include<rectangle.h>
using csce240_shapes::Rectangle;
#include<square.h>
using csce240_shapes::Square;
#include<iostream>
using std::cout;
using std::endl;

int main() {
  Rectangle r;
  r.Print();
  Square s(5);
  s.Print(); // this function from Rectangle is only accessible on Square
             // objects if we use public inheritance
  cout << "The area of s is " << s.Area() << endl;
  return 0;
}
