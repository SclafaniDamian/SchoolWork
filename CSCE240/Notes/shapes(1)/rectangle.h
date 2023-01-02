// Copyright 2022 CSCE240
// define a Rectangle class
#ifndef _RECTANGLE_H_
#define _RECTANGLE_H_

namespace csce240_shapes {

class Rectangle {
  // friends are entities outside of the class that are given direct access
  // to the private members - just say friend followed by the function
  // prototype, class name, etc

 public:
  // we'll add explicit back shortly - needed when you have a constructor
  // that can be called with 1 argument
  explicit Rectangle(double l = 1, double w = 1);

  void SetLength(double l);
  void SetWidth(double w);

  double GetLength() const { return length_; }
  double GetWidth() const { return width_; }

  double Area() const;
  void Print() const;

 protected:  // for members and derived classes, not objects
  void Halve() { length_ /= 2; width_ /=2; }

 private:  // ONLY accessible to members and friends (NOT directly accessible
           // by children
  double length_;
  double width_;
};  // ends class Rectangle definition

}  // namespace csce240_shapes

#endif  // _RECTANGLE_H_
