// Copyright 2022 CSCE240
// define the Square class, a Square IS A Rectangle
#ifndef _SQUARE_H_
#define _SQUARE_H_

#include<rectangle.h>

namespace csce240_shapes {

// Square is the child, Rectangle is the parent
// Square is the derived class, Rectangle is the base class
// Square is the descendant, Rectangle is the ancestor
class Square : public Rectangle {
  // with public inheritance: public members in the base class are public
  //                          in the derived class
  //                          protected members in the base class are protected
  //                          in the derived class
  //                          private members in the base class are hidden
  //                          in the derived class
  // with protected inheritance: public members in the base class are PROTECTED
  //                          in the derived class
  //                          protected members in the base class are protected
  //                          in the derived class
  //                          private members in the base class are hidden
  //                          in the derived class

 public:
  explicit Square(double s = 1);
  void Print() const;  // re-defining the Print function for the Square class
};

}  // namespace csce240_shapes

#endif   // _SQUARE_H_
