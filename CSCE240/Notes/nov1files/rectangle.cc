// Copyright 2022 CSCE240
// implementing the functionality of the Rectangle class
#include"rectangle.h"
#include<iostream>
using std::cout;
using std::endl;

namespace csce240_shapes {

// placing these implementations in the namespace allows us to avoid
// qualifying all the functions with  csce240_shapes::
Rectangle::Rectangle(double l, double w) : length_(1), width_(1) {
  SetLength(l);
  SetWidth(w);
}

void Rectangle::SetLength(double l) {
  if ( l > 0 )
    length_ = l;
}

void Rectangle::SetWidth(double w) {
  if ( w > 0 )
    width_ = w;
}

void Rectangle::Print() const {
  cout << "length: " << length_ << "; width: " << width_ << endl;
}

double Rectangle::Area() const {
  return length_ * width_;
}

}  // namespace csce240_shapes
