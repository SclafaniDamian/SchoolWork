// Copyright 2022 CSCE2022
// define comic book class
#ifndef _COMICBOOK_H_
#define _COMICBOOK_H_

#include<book.h>  // since this will be a child of Book, include book.h
#include<string>
using std::string;

// place this in the same namespace as boo
namespace csce240_books {

class ComicBook : public Book {
 public:
  ComicBook();
 private:
  string hero_;  // adding a hero data member that is not in the base class
};  // end class ComicBook


}  // end namespace csce240_books

#endif  // _COMICBOOK_H_
