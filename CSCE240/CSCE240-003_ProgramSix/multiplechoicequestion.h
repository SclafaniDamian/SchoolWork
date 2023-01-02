// Copyright 2022 CSCE240-003 Damian Sclafani
#ifndef _MULTIPLECHOICEQUESTION_H_
#define _MULTIPLECHOICEQUESTION_H_

#include<question.h>
#include<string>
using std::string;

// MultipleChoiceQuestion should be a child of the Question class
namespace csce240_program6 {
class MultipleChoiceQuestion : public Question {
 public:
  // The class should have a private integer data member that holds the number
  // of answer choices for the question. Add an accessor and mutator function
  // for this data member
  int GetNumAnswerChoices() const { return numAnswerChoices_; }
  void SetNumAnswerChoices(int num) { numAnswerChoices_ = num; }
  string GetQuestion() { return question_; }
  void SetQuestion(string question) { question_ = question; }

  // Create an explicit constructor that allows the question, the number of
  // choices, the answer choices, and the answer correct/incorrect values to be
  // initialized when the object is instantiated. The parameters should have
  // default argments of "?", 0, nullptr, and nullptr, respectively.
  // If all but the last two arguments are provided, make all of the answer
  // choices the empty string "", and all of the correct/incorrect values true.
  // If all but the last argument is provided, default all correct/incorrect
  // values to true.
  // The prototype is provided below
  explicit MultipleChoiceQuestion(string = "?", int = 0, string * = nullptr,
                                  bool * = nullptr);

  // Create a copy constructor (note: this is required since your class has
  // pointers as data members)
  MultipleChoiceQuestion(const MultipleChoiceQuestion & to_copy);

  // Create a virtual destructor that frees up all dynamically allocated memory
  ~MultipleChoiceQuestion();

  // Add a SetAnswerChoices function that sets the number of choices, the
  // values of the answer choices, and the answer correct/incorrect values.
  // This function will dynamically allocate and deallocate memory for the
  // data members, as necessary. The prototype is provided below
  void SetAnswerChoices(int, string *, bool *);

  // Add a virtual Print function (see the Question class for the prototype)
  // This fuction should send output to the standard output device, using cout.
  // The first line of output should be "Question: " followed by the value of
  // the question data member.
  // The next line of output should be "Answer Choices:"
  // The following lines should print each answer a separate line.
  // If the Print function's argument is true, each answer choice should be
  // followed by " - correct" or " - incorrect"
  virtual void Print(bool arg) const;

 private:
  int numAnswerChoices_;
  string question_;
  // The class should have a private string pointer data member that holds the
  // answer choices for the question.
  string * answerChoices_;

  // The class should have a private bool pointer data member that holds whether
  // each of the answer choices for the question is correct or not.
  bool * correctAnswer_;
};
}   // namespace csce240_program6

#endif  // _MULTIPLECHOICEQUESTION_H_
