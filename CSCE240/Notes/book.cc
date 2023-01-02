// Copyright 2022 CSCE240
// implement functionality of Book class
#include<book.h>
#include<string>
using std::string;
#include<iostream>
using std::cout;
using std::endl;

Book::Book(string title) {
  SetTitle(title);
  num_chapters_ = 0;
  chapters_ = nullptr;
}

Book::~Book() {
  delete [] chapters_;  // release the dynamically allocated memory that
                        // chapters_ points to whenever we delete a Book
                        // object
}

Book::Book(const Book& book_to_copy) {
  title_ = book_to_copy.title_;
  num_chapters_ = 0;
  SetChapters(book_to_copy.chapters_, book_to_copy.num_chapters_);
}

Book& Book::operator = (const Book& right_operand) {
  title_ = right_operand.title_;
  num_chapters_ = 0;
  SetChapters(right_operand.chapters_, right_operand.num_chapters_);
  return *this;  // this is a pointer that every object has, which holds its
                 // address. Returning this to allow b1 = b2 = b3... multiple
                 // assignments in a single statement
}

void Book::SetTitle(string title) {
  title[0] = toupper(title[0]);
  title_ = title;
}

void Book::SetChapters(string chapter_names[], int num_chapters) {
  if ( num_chapters < 0 )
    return;
  if ( num_chapters != num_chapters_ ) {
    // free up the old space
    if ( num_chapters_ > 0 )
      delete [] chapters_;

    // make new space
    if ( num_chapters > 0 )
      chapters_ = new string[num_chapters];

    if ( chapters_ == NULL || chapters_ == nullptr ) {
      cout << "Could not reserve requested space" << endl;
      exit(1);
    }
    if ( num_chapters == 0 )
      chapters_ = nullptr;
  }
  num_chapters_ = num_chapters;
  // copy the values over
  for ( int i = 0; i < num_chapters_; ++i )
    chapters_[i] = chapter_names[i];
}