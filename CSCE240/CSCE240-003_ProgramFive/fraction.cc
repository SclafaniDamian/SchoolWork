// Copyright 2022 CSCE240-003 Damian Sclafani
// implement Fraction class functionality here
#include<fraction.h>
#include<iostream>
using std::cout;
using std::endl;
namespace csce240_program5 {

  // Fraction constructor
  // default value is 0/1
  Fraction::Fraction(int n, int d) : numerator_(0), denominator_(1) {
    SetNumerator(n);
    SetDenominator(d);
  }

  // Sets the numerator value to the inputted integer
  // Any integer value is valid
  void Fraction::SetNumerator(int n) {
    numerator_ = n;
  }

  // Sets the denominator value to the inputted integer
  // Any integer except 0 is valid
  void Fraction::SetDenominator(int d) {
    if (d != 0) {
      denominator_ = d;
    }
  }

  // Overloads the == operator to allow comparison between two Fractions
  bool Fraction::operator ==(Fraction f) const {
    int num1 = numerator_;
    int den1 = denominator_;
    int num2 = f.GetNumerator();
    int den2 = f.GetDenominator();
    return (num1 * den2) == (num2 * den1);
  }

  // Converts the Fraction to a decimal value (returns as a double)
  double Fraction::ToDecimal() const {
    double result = static_cast<double>(numerator_) / denominator_;
    return result;
  }

  // Multiplies a Fraction by an inputted integer
  void Fraction::Multiply(int num) {
    numerator_ *= num;
    for (int i = 10; i > 1; i--) {
      if ((numerator_ % i == 0) && (denominator_ % i == 0)) {
        numerator_ /= i;
        denominator_ /= i;
      }
    }
  }

  // Overloads the * operator to be able to multiply Fractions together
  Fraction Fraction::operator *(Fraction f) const {
    int newNum = numerator_ * f.GetNumerator();
    int newDen = denominator_ * f.GetDenominator();
    Fraction newF = Fraction(newNum, newDen);
    return newF;
  }

  // Divides a Fraction by an inputted integer
  void Fraction::Divide(int num) {
    if (num > 0) {
      denominator_ *= num;
    } else if (num < 0) {
      numerator_ *= -1;
      denominator_ *= num * -1;
    }
  }

  // Returns the Fraction as a string value
  string Fraction::ToString() const {
    return std::to_string(numerator_) + "/" + std::to_string(denominator_);
  }
}   // namespace csce240_program5
