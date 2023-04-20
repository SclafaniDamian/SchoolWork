// Copyright 2022 Damian Sclafani CSCE240-003
#include<operator_functions.h>
#include<iostream>
using std::cout;
using std::endl;
using std::cin;
#include<fstream>
using std::ifstream;
#include<string>
using namespace std;

int main() {
  double n1, n2;
  char o;
  ifstream my_file("arithmetic_expressions.txt");
  my_file >> n1 >> o >> n2;
  while (my_file.good()) {
    if ((IsInteger(n1) && (IsInteger(n2)) && (IsArithmeticOperator(o)))) {
      if (((o == '/') || (o == '%')) && n2 == 0) {
        cout << "Could not compute " << n1 << " " << o << " " << n2;
      }
      else {
        double answer = 0;
        Compute(n1, o, n2, answer);
        cout << n1 << " " << OperatorToWords(o) << " " << n2 << " equals " << answer;
      }
    }
		else if (!IsArithmeticOperator(o)) {
			cout << "Unrecognized operation " << o;
		}
		else {
			cout << "Unrecognized value";
		}
}
}