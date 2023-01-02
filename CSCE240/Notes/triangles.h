// Copyright 2022 Damian Sclafani CSCE240
// this file contains the prototypes for my triangle function
#ifndef _TRIANGLES_H_
#define _TRIANGLE_H_

// function to take three side lengths and returns whether
// or not those three lengths are valid for the sides of
// a triangle
// preconditions: function expects three real numbers
// postconditions: will return true if the arguments are
// 				   positive and the sum of each pair is
//				   greater than the third
bool IsTriangleSides(double side1, double side2, double side3);

// function to take three triangle side lengths and return whether
// or not it's a scalene triangle (scalene = all different side lengths)
// preconditions: function expects three real numbers
// postconditions: returns true if valid scalene triangle lengths
//                 false otherwise
bool IsScaleneTriangleSides(double side1, double side2, double side3);
#endif