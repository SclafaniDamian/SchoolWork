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
};

}  // namespace csce240_shapes

#endif   // _SQUARE_H_
