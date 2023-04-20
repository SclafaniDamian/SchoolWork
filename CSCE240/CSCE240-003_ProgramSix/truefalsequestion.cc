// Copyright 2022 CSCE240-003 Damian Sclafani
#include<truefalsequestion.h>
#include<iostream>
#include<string>
using std::string;
using std::cout;
using std::endl;

namespace csce240_program6 {

  // constructor
  TrueFalseQuestion::TrueFalseQuestion(string question, bool answer) {
    SetQuestion(question);
    SetAnswer(answer);
  }

  void TrueFalseQuestion::Print(bool arg) const {
    cout << "Question: " << question_ << endl;
    if (arg) {
      string temp = "";
      if (answer_) {
        temp = "true";
      } else {
        temp = "false";
      }
      cout << "Correct Answer: " << temp << endl;
    }
  }
}   // namespace csce240_program6
