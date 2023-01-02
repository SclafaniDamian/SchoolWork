// Copyright 2022 CSCE240-003 Damian Sclafani
// implement Probability class functionality here
#include<probability.h>
#include<fraction.h>
#include<iostream>
namespace csce240_program5 {

  // Probability Constructor
  // Takes in two integers
  // Default value is 0/1
  Probability::Probability(int n, int d) : Fraction(0, 1) {
    if (n <= d) {
      SetNumerator(n);
    SetDenominator(d);
    }
  }

  // Probability Constructor
  // Takes in a Fraction
  Probability::Probability(Fraction f) {
    if (f.GetNumerator() >= 0) {
      SetNumerator(f.GetNumerator());
    }
    if ((f.GetDenominator() != 0) && (f.GetNumerator() <= f.GetDenominator())) {
      SetDenominator(f.GetDenominator());
    }
  }

  // Sets the numerator to the inputted integer if valid
  // Numerator can't be negative
  // Numerator can't be bigger than the denominator
  void Probability::SetNumerator(int n) {
    if (n >= 0) {
      Fraction::SetNumerator(n);
    }
  }

  // Sets the denominator to the inputted interger if valud
  // Denominator can't be 0
  // Denominator can't be smaller than the Numerator
  void Probability::SetDenominator(int d) {
    if ((d != 0) && (Fraction::GetNumerator() <= d)) {
      Fraction::SetDenominator(d);
    }
  }

  // Mutiplies the Probability by an inputted integer
  // Keeps the probability valid
  void Probability::Multiply(int num) {
    if ((num * GetNumerator()) <= GetDenominator()) {
      SetNumerator(num * GetNumerator());
    }
    for (int i = 10; i > 1; i--) {
      if ((GetNumerator() % i == 0) && (GetDenominator() % i == 0)) {
        SetNumerator(GetNumerator() / i);
        SetDenominator(GetDenominator() / i);
      }
    }
  }

  // Overloads the * operator so that you can multiple two Probabilities
  // Keeps the new Probability valid
  Probability Probability::operator *(Probability f) const {
    int newNum = GetNumerator() * f.GetNumerator();
    int newDen = GetDenominator() * f.GetDenominator();
    for (int i = 10; i > 1; i--) {
      if ((newNum % i == 0) && (newDen % i == 0)) {
        newNum /= i;
        newDen /= i;
      }
    }
    Probability newF = Probability(newNum, newDen);
    return newF;
  }

  // Divides a Probability by an inputted integer
  // Keeps the Probability valid
  void Probability::Divide(int num) {
    if (num > 0) {
      SetDenominator(GetDenominator() * num);
    } else if (num < 0) {
      SetNumerator(GetNumerator() * -1);
      SetDenominator(GetDenominator() * -1 * num);
    }
  }

  // Checks the odds in favor of getting the Numerator
  // Returns as a string value
  string Probability::OddsInFavor() const {
    int result = GetDenominator() - GetNumerator();
    return std::to_string(GetNumerator()) + ":" + std::to_string((result));
  }
}   // namespace csce240_program5
