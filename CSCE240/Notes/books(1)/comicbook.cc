// Copyright 2022 CSCE2022
// implement the comic book class members
#include<book.h>  // since this will be a child of Book, include book.h
#include"comicbook.h"  // since comic book includes book, we could get away
         // with leaving off line 3, but it's good to show all dependencies

// place this in the same namespace as boo
namespace csce240_books {

ComicBook::ComicBook() : Book("comic book") {
  hero_ = "gamecock";
// num_chapters_++; can't access private members of the base class
}

}  // end namespace csce240_books
