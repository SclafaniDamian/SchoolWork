// Copyright 2022 CSCE240-003 Damian Sclafani
#ifndef _TRUEFALSEQUESTION_H_
#define _TRUEFALSEQUESTION_H_

#include<question.h>
#include<string>
using std::string;

// TrueFalseQuestion should be a child of the Question class
namespace csce240_program6 {
class TrueFalseQuestion : public Question {
 public:
  // The class should have a private bool data member that holds whether the
  // answer to the question is true or false. Add an accessor and mutator
  // function for this data member
  bool GetAnswer() { return answer_; }
  void SetAnswer(bool tf) { answer_ = tf; }
  string GetQuestion() { return question_; }
  void SetQuestion(string question) { question_ = question; }

  // Create an explicit constructor that allows the question and answer to be
  // initialized when an object is instantiated. The question and answer
  // parameters should have default arguments of "?" and true, respectively.
  explicit TrueFalseQuestion(string = "?", bool = true);

  // Add a virtual Print function (see the Question class for the prototype)
  // This fuction should create 1 or 2 lines of output to the standard output
  // device, using cout.
  // The first line of output should be "Question: " followed by the value of
  // the question data member.
  // If the Print function's argument is true, it should output a second line
  // that is "Correct Answer: " followed by "true" or "false" depending on the
  // value of the private data member.
  virtual void Print(bool arg) const;

 private:
  bool answer_;
  string question_;
};
}   // namespace csce240_program6

#endif  // _TRUEFALSEQUESTION_H_
