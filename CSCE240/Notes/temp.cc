// Copyright 2022 CSCE240 bhipp
// Implement the Temp class member functions
#include<temp.h>
#include<iostream>
using std::endl;
using std::cout;
using std::ostream;
using std::istream;
#include<string>
using std::string;

// setting the value of this static member for the entire class, not setting
// it in the constructor each time an object is instantiated
int Temp::degree_symbol_or_word_ = 1;

void Temp::SetDegreeSymbolOrWord(int d) {
  if ( d == 1 || d == 2 )
    degree_symbol_or_word_ = d;
}

istream& operator >> (istream& wherefrom, Temp& t) {
  string m;
  wherefrom >> t.value_ >> m;
  t.SetMeasure(m);
  return wherefrom;  // return the istream& used to allow cascading operations
}


// since this operator is a friend, it can directly access private members
// value_ and measure_ on the Temp object t
ostream& operator << (ostream& whereto, Temp t) {
  // static members can be reference through the class as a whole, using
  // the scope resolution operator
  if ( Temp::degree_symbol_or_word_ == 1 )
    whereto << t.value_ << " degrees " << t.measure_;
  else                     // unicode for the degree symbol
    whereto << t.value_ << (t.measure_ == "Kelvin" ? "" :" \u00B0" )
            << t.measure_[0];
  return whereto;  // returning the left operand to allow cascading calls
}

// constructor            member initializer list - can set data member
//                        values prior to entering the body of the constructor
Temp::Temp(double v, string m) : value_(0) {
  SetValue(v);
  measure_ = "Fahrenheit";
  SetMeasure(m);
}

// destructor
Temp::~Temp() {
  // an output statement for testing only to see when the destructor is called
  // cout << "destructor called for " << value_ << " " << measure_ << endl;
}

bool Temp::operator >(Temp right) const {
  // take the right operand and convert to the same measure as the left operand
  right.Convert(measure_);
  return value_ > right.GetValue();
}

bool Temp::operator <(Temp right) const {
  right.Convert(measure_);
  return value_ < right.GetValue();
}

// post-increment   i++ int
Temp Temp::operator ++(int) {
  Temp temp_copy(value_, measure_);
  value_ += 1;
  return temp_copy;  // the post-increment returns a copy of the Temperature
                     // BEFORE it was changed by the operation
}
// pre-increment    ++i
Temp Temp::operator ++() {
  value_ += 1;
  // return the updated Temp;
  return *this;  // the "this" pointer holds the address of the object
                 // the * operator "dereferences" the pointer - goes to the
                 // address and gets the value
}

// when implementing a member function outside of the class definition, use
// the scope resolution operator to tie it to the class
double Temp::GetValue() const {
  return value_;
}

string Temp::GetMeasure() const {
  return measure_;
}

void Temp::SetValue(double v) {
  value_ = v;
}

void Temp::SetMeasure(string m) {
  if ( m == "Celsius" || m == "Fahrenheit" || m == "Kelvin" )
    measure_ = m;
}

void Temp::Print() const {
  cout << value_ << " degrees " << measure_ << endl;
}

void Temp::Convert(string new_measure) {
  if ( measure_ == "Fahrenheit" ) {
    if ( new_measure == "Celsius" ) {
      value_ = (value_ - 32) * 5 / 9.0;
      measure_ = new_measure;
    } else if ( new_measure == "Kelvin" ) {
      value_ = (value_ - 32) * 5 / 9.0 + 273.15;
      measure_ = new_measure;
    }
  } else if ( measure_ == "Celsius" ) {
    if ( new_measure == "Fahrenheit" ) {
      value_ = value_ * 9 / 5.0 + 32;
      measure_ = new_measure;
    } else if ( new_measure == "Kelvin" ) {
      value_ += 273.15;
      measure_ = new_measure;
    }
  } else if ( measure_ == "Kelvin" ) {
    if ( new_measure == "Celsius" ) {
      value_ -= 273.15;
      measure_ = new_measure;
    } else if ( new_measure == "Fahrenheit" ) {
      value_ = (value_ - 273.15) * 9 / 5.0 + 32;
      measure_ = new_measure;
    }
  }
}