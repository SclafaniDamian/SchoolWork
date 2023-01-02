// Copyright 2022 CSCE240-003 Damian Sclafani
#include<shortanswerquestion.h>
#include<iostream>
#include<string>
using std::string;
using std::cout;
using std::endl;

namespace csce240_program6 {

  // constructor
  ShortAnswerQuestion::ShortAnswerQuestion(string question, string answer) {
    SetQuestion(question);
    SetCorrectAnswer(answer);
  }

  void ShortAnswerQuestion::Print(bool arg) const {
    cout << "Question: " << question_ << endl;
    if (arg) {
      cout << "Correct Answer: " << correctAnswer_ << endl;
    }
  }

}   // namespace csce240_program6

