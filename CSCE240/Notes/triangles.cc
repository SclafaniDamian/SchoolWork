// Copyright 2022 Damian Sclafani CSCE240
// this file contains the implementations for my triangle function
#include<triangles.h>  // include the header with the prototypes
                       // for these functions
bool IsTriganleSides(double side1, double side2, double side3) {
	return (side1 > 0 && side2 > 0 && side3 > 0 && side1 + side2 > side3
					&& side1 + side3 > side2 && side2 + side3 > side1);
}

bool IsScaleneTriangleSides(double side1, double side2, double side3) {
	bool to_return = IsTriangleSides(side1, side2, side3);
	return to_return && side1 != side2 && side1 != side3 && side2 != side3;
}