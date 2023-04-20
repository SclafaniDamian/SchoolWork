// Copyright 2022 CSCE240-003 Damian Sclafani
#include<multiplechoicequestion.h>
#include<iostream>
#include<string>
using std::string;
using std::cout;
using std::endl;

namespace csce240_program6 {
  MultipleChoiceQuestion::MultipleChoiceQuestion(string question,
    int numAnswerChoices, string * answerChoices, bool * correctAnswer) {
    SetQuestion(question);
    numAnswerChoices_ = 0;
    answerChoices_ = nullptr;
    correctAnswer_ = nullptr;
    if (answerChoices == nullptr) {
      answerChoices = new string[numAnswerChoices];
      for (int i = 0; i < numAnswerChoices; i++) {
        answerChoices[i] = "";
      }
    }
    if (correctAnswer == nullptr) {
      correctAnswer = new bool[numAnswerChoices];
      for (int i = 0; i < numAnswerChoices; i++) {
        correctAnswer[i] = true;
      }
    }
    SetAnswerChoices(numAnswerChoices, answerChoices, correctAnswer);
  }

  MultipleChoiceQuestion::MultipleChoiceQuestion(const
    MultipleChoiceQuestion & to_copy) {
    question_ = to_copy.question_;
    SetAnswerChoices(to_copy.numAnswerChoices_, to_copy.answerChoices_,
     to_copy.correctAnswer_);
  }

  MultipleChoiceQuestion::~MultipleChoiceQuestion() {
    delete [] answerChoices_;
    delete [] correctAnswer_;
  }

  void MultipleChoiceQuestion::SetAnswerChoices(int num, string * choices,
   bool * correct) {
    if (num >= 0) {
      numAnswerChoices_ = num;
    }
    if (answerChoices_ > 0) {
      delete [] answerChoices_;
    }
    if (num > 0) {  // allocate new space
      answerChoices_ = new string[num];
      correctAnswer_ = new bool[num];
    }
    /*if ( answerChoices_ == NULL ) {
       cout << "Requested memory could not be allocated" << endl;
       exit(1);  // terminate the program if the memory could not be allocated
    }*/
    for ( int i = 0; i < numAnswerChoices_; ++i ) {
      answerChoices_[i] = choices[i];
      correctAnswer_[i] = correct[i];
    }
  }

  void MultipleChoiceQuestion::Print(bool arg) const {
    cout << "Question: " << question_ << endl;
    cout << "Answer Choices:" << endl;
    for (int i = 0; i < numAnswerChoices_; ++i) {
      if (arg) {
        string temp = "";
        if (correctAnswer_[i]) {
          temp = "correct";
        } else {
          temp = "incorrect";
        }
        cout << answerChoices_[i] << " - " << temp << endl;
      } else {
        cout << answerChoices_[i] << endl;
      }
    }
  }

}   // namespace csce240_program6
