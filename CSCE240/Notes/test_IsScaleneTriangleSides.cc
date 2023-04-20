// Copyright 2022 CSCE240-003
// this file contains unit tests for the IsScaleneTriangleSides function
#include<triangles.h>
#include<iostream>
using std::cout;
using std::endl;

// a test for a valid scalene triangle
bool GoodIsScalene1() {
    return IsScaleneTriangleSides(3.2, 4.1, 5.006);
}

// a test for a non-triangle
bool BadIsScalene1() {
    return !IsScaleneTriangleSides(0, 3, 7);
}

// a test for a triangle that's not scalene
bool BadIsScalene2() {
    return !IsScaleneTriangleSides(4, 5, 5);
}

int main() {
    if (GoodIsScalene1()) {
        cout << "Passed good scalene test 1" << endl;
    }
    else {
        cout << "Failed good scalene test 1" << endl;
    }
     if (BadIsScalene1()) {
        cout << "Passed bad scalene test 1" << endl;
    }
    else {
        cout << "Failed bad scalene test 1" << endl;
    }
     if (BadIsScalene2()) {
        cout << "Passed bad scalene test 2" << endl;
    }
    else {
        cout << "Failed bad scalene test 2" << endl;
    }
}