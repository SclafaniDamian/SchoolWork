// Copyright 2022 CSCE240
// pointers to objects
// and the consequences of having pointers as data members
#include<book.h>
#include<iostream>
using std::cout;
using std::endl;
using std::cin;
#include<string>
using std::string;


int main() {
  Book b("a book");
  cout << b.GetTitle() << endl;
  b.SetTitle("Absolute C++");
  cout << b.GetTitle() << endl;
  string chapter_names[3] = {"Introduction", "Variable Data Types",
                             "Control Structures" };
  b.SetChapters(chapter_names, 3);
  for ( int i = 0; i < b.GetNumChapters(); ++i )
    cout << b.GetChapters()[i] << endl;

  // the line below uses our copy constructor
  Book b2(b);  // create a new book object as a copy of the existing book b

  b2.SetTitle("another title");
  b2.SetChapters(chapter_names, 2);
  cout << "b title  = " << b.GetTitle() << endl;
  cout << "b2 title = " << b2.GetTitle() << endl;

  cout << "\n\nb chapters: \n";
  for ( int i = 0; i < b.GetNumChapters(); ++i )
    cout << b.GetChapters()[i] << endl;

  cout << "\n\nb2 chapters: \n";
  for ( int i = 0; i < b2.GetNumChapters(); ++i )
    cout << b2.GetChapters()[i] << endl;

  Book b3("third book");
  // the line below calls our overloaded assignment operator twice
  b3 = b = b2;  // makes all three objects have the same title, num_chapters
                // and chapter titles as b2 - but they're SEPARATE copies so
                // changes to one won't affect the others
  cout << "After b3 = b = b2 " << endl;
  cout << "\n\nb chapters: \n";
  for ( int i = 0; i < b.GetNumChapters(); ++i )
    cout << b.GetChapters()[i] << endl;

  cout << "\n\nb2 chapters: \n";
  for ( int i = 0; i < b2.GetNumChapters(); ++i )
    cout << b2.GetChapters()[i] << endl;

  cout << "\n\nb3 chapters: \n";
  for ( int i = 0; i < b3.GetNumChapters(); ++i )
    cout << b3.GetChapters()[i] << endl;

  string new_chapters[5] = {"hey", "hi", "how's it going", "sup", "yo"};
  b3.SetChapters(new_chapters, 5);

  cout << "After b3 chapter change " << endl;
  cout << "\n\nb chapters: \n";
  for ( int i = 0; i < b.GetNumChapters(); ++i )
    cout << b.GetChapters()[i] << endl;

  cout << "\n\nb2 chapters: \n";
  for ( int i = 0; i < b2.GetNumChapters(); ++i )
    cout << b2.GetChapters()[i] << endl;

  cout << "\n\nb3 chapters: \n";
  for ( int i = 0; i < b3.GetNumChapters(); ++i )
    cout << b3.GetChapters()[i] << endl;


  return 0;
}