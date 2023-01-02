// Copyright 2022 CSCE240-003 Damian Sclafani
#include<employee.h>
#include<taxid.h>
#include<iostream>
using std::cout;
using std::endl;
#include<string>

// default constructor
Employee::Employee() : taxId_("999999999") {
  hoursPerWeek_ = 40;
  payType_ = 2;
}

// constructor
Employee::Employee(string taxId, int payType, double hoursPerWeek) :
                    taxId_(taxId) {
  payType_ = payType;
  hoursPerWeek_ = hoursPerWeek;
}

// Sets the pay type to either salaried(1), hourly(2), or contracted(3)
// based on the number given
void Employee::SetPayType(int payType) {
  if (payType == 1 || payType == 2 || payType == 3) {
    payType_ = payType;
  }
}

// Sets the pay type to either salaried, hourly, or cotracted based
// on the string
void Employee::SetPayType(string payTypeStr) {
  if (payTypeStr == "salaried") {
    payType_ = 1;
  } else if (payTypeStr == "hourly") {
    payType_ = 2;
  } else if (payTypeStr == "contract") {
    payType_ = 3;
  }
}

// Returns the payment type
string Employee::GetPayType() const {
  if (payType_ == 1) {
    return "salaried";
  } else if (payType_ == 2) {
    return "hourly";
  } else if (payType_ == 3) {
    return "contract";
  }
}

// Sets the hours per week of the employee
void Employee::SetHoursPerWeek(double hours) {
  if (hours >= 0 && hours <= 40) {
    hoursPerWeek_ = hours;
  }
}

// Returns the employee's hours per week
double Employee::GetHoursPerWeek() const {
  return hoursPerWeek_;
}

// Sets the value of the employee's tax ID
void Employee::SetTaxId(string taxId) {
  taxId_.SetId(taxId);
}

// Returns the employee's tax ID
string Employee::GetTaxId() const {
  return taxId_.GetId();
}
