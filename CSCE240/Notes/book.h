// Copyright 2022 CSCE240
#ifndef _BOOK_H_
#define _BOOK_H_

#include<string>
using std::string;

class Book {
 public:
  explicit Book(string title);

  // destructor
  ~Book();

  // copy constructor
  Book(const Book&);  // more efficient to send objects to functions by
                      // reference so the constructor doesn't have to create
                      // copies of all the data members for the parameter

  // assignment operator
  // note: returning a Book& allows multiple assignments in a single
  //       statement. e.g. b1 = b2 = b3; sets b1 and b2 to b3
  Book& operator = (const Book& right_operand);
  // b1 = b2;
  // b1 = b2 = b3;

  // SetTitle will set the title of the book to title, beginning with an
  // uppercase character
  void SetTitle(string title);

  string GetTitle() const { return title_; }

  // preconditions - SetChapters will be sent an array of strings for the
  //                 chapter names and the size of that array (should be a
  //                 positive integer
  // postconditions - if num_chapters is valid and the same as the current
  //                  number of chapters, copy the names over
  //                  if num_chapters is valid and different from the current
  //                  number of chapters, we'll free up the space for the
  //                  previous chapter names, create space for the new chapter
  //                  names, and copy those over
  //                  if num_chapters is not valid, then no change will be made
  void SetChapters(string chapter_names[], int num_chapters);

  const string * GetChapters() const { return chapters_; }

  int GetNumChapters() const { return num_chapters_; }

 private:
  string title_;
  string * chapters_;  // any time we have a pointer as a data member we will
                       // need to add a destructor, a copy constructor, and
                       // overloaded assignment operator to our class
  int num_chapters_;
};

#endif  // _BOOK_H_