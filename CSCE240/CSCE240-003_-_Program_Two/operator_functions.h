// Copyright 2022 Damian Sclafani CSCE240-003
#include<iostream>
#include<string>

#ifndef _OPERATOR_FUNCTIONS_H_
#define _OPERATOR_FUNCTIONS_H_
using namespace std;

bool IsInteger(double num1);

bool IsArithmeticOperator(char sym1);

string OperatorToWords(char sym1);

bool Compute(double num1, char sym1, double num2, double answer);

#endif