// Copyright 2022 CSCE240 bhipp
// introduction to classes in C++
#ifndef _TEMP_H_
#define _TEMP_H_
#include<string>
using std::string;
#include<iostream>
using std::cout;
using std::ostream;
using std::istream;

class Temp {
  // we're making the stream insertion operator a friend of our class
  // giving it direct access to Temp object members
  friend ostream& operator << (ostream& whereto, Temp t);

  // make the stream extraction operator a friend of the class
  // the right operand must be a Temp object that will be changed by
  // this operation - so use call-by-reference
  friend istream& operator >> (istream& wherefrom, Temp& t);

  // members of the class are listed here
 public:
  // constructor - function with the same name as the class that's will be
  //               called when we instantiate an object of the class (declare
  //               a variable of the class type)
  // use explicit for constructors callable with one argument to avoid
  // implicit conversion of a double to a Temp object via this constructor
  explicit Temp(double v = 0, string m = "Fahrenheit");

  // destructor - function that is called when the memory for an object is
  //              freed - do any necessary housekeeping when an object is
  //              destructed
  ~Temp();

  // overload the > operator
  // by making this a member it's called as t.operator > (right)
  bool operator >(Temp right) const;

  // overload the < operator
  // this can be a member, since it takes a Temp object on the left
  bool operator <(Temp right) const;

  // post-increment   i++ int
  Temp operator ++(int);  // int is a dummy operand
  // pre-increment    ++i
  Temp operator ++();


  // accessor function - function that provides access to a copy of the value
  //                     of a private data member
  double GetValue() const;  // const qualifier here says this is a constant
                             // member function, meaning that the object
                             // the function is called on won't be changed
                             // by the function call
  string GetMeasure() const;

  void Print() const;
  // mutator function - function that allows modification of a private data
  //                    member
  void SetValue(double);
  void SetMeasure(string);
  void Convert(string new_measure);

  // static set function for degree_symbol_or_word_
  static void SetDegreeSymbolOrWord(int d);  // we can call this on the class
             // don't have to call it on an object

  // private members are accessible within the class and by friends of the class
  // we make things private to restrict access
 private:
  double value_;  // Google style guide, end data member names with _ in a class
  string measure_;

  // static means there's one of these for the entire class instead of
  // having a separate one for each object
  // 1 denotes display value "degrees" full name of measure
  // 2 denotes dislpay value degree symbol K/C/F
  static int degree_symbol_or_word_;
};

#endif