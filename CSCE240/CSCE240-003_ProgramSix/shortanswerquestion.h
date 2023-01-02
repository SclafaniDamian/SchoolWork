// Copyright 2022 CSCE240-003 Damian Sclafani
#ifndef _SHORTANSWERQUESTION_H_
#define _SHORTANSWERQUESTION_H_

#include<question.h>
#include<string>
using std::string;

// ShortAnswerQuestion should be a child of the Question class
namespace csce240_program6 {
class ShortAnswerQuestion : public Question {
 public:
  // The class should have a private string data member that holds the correct
  // answer to the question. Add an accessor and mutator function for this data
  // member
  string GetCorrectAnswer() { return correctAnswer_; }
  void SetCorrectAnswer(string answer) { correctAnswer_ = answer; }
  string GetQuestion() { return question_; }
  void SetQuestion(string question) { question_ = question; }

  // Create an explicit constructor that allows the question and answer to be
  // initialized when instantiated. The question and answer parameters should
  // have default arguments of "?" and "", respectively.
  explicit ShortAnswerQuestion(string = "?", string = "");

  // Add a virtual Print function (see the Question class for the prototype)
  // This fuction should create 1 or 2 lines of output to the standard output
  // device, using cout.
  // The first line of output should be "Question: " followed by the value of
  // the question data member.
  // If the Print function's argument is true, it should output a second line
  // that is "Correct Answer: " followed by the value of the correct answer
  // private data member.
  virtual void Print(bool arg) const;

 private:
  string correctAnswer_;
  string question_;
};
}   // namespace csce240_program6

#endif  // _SHORTANSWERQUESTION_H_
