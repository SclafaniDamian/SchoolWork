// Copyright 2022 CSCE240
// implement functionality of Square class
#include<square.h>
#include<iostream>
using std::cout;
using std::endl;

namespace csce240_shapes {
                         // base class constructor must be called in the
                         // derived class constructor's member initializer list
                         // can't be called inside the function
Square::Square(double s) : Rectangle(s, s) {
}

void Square::Print() const {
  cout << "Square with sides of length " << GetLength() << endl;
}

}  // namespace csce240_shapes
