// Copyright 2022 CSCE240 bhipp
// introduction to struct and class
#include<iostream>
using std::cout;
using std::cin;
using std::endl;
#include<string>
using std::string;

// we'll name our classes and structs with an identifier that begins
// with a capital letter
struct Produce {
  // declaring the members of the Produce struct
  string item_name;
  double unit_price;
  string units;
};  // semicolon is required (and easy to forget - don't)

void Print(Produce prod) {
  cout << prod.item_name << " costs $" << prod.unit_price << " per "
       << prod.units << endl;
}

// insertion sort algorithm - build larger and larger sorted array
void InsertionSort(Produce stuff[], int size ) {
  for ( int to_insert = 1; to_insert < size; ++to_insert ) {
    int i = to_insert;
    while ( i > 0 && stuff[i].item_name < stuff[i-1].item_name ) {
      Produce temp = stuff[i];
      stuff[i] = stuff[i-1];
      stuff[i-1] = temp;
      --i;
    }
  }
}

void ConvertToLower(Produce& p) {
  for ( int i = 0; i < p.item_name.length(); ++i )
    p.item_name[i] = tolower(p.item_name[i]);
  for ( int j = 0; j < p.units.length(); ++j )
    p.units[j] = tolower(p.units[j]);
}

// binary search -
// pre-conditions = sent an array of Produce that is sorted by item_name
// post-condition = return the position of the element that we're looking for
//                  if it's in the array and -1 if it's not in there
int BinarySearch(const Produce sorted[], int size, Produce search_value ) {
  int low = 0, high = size - 1, middle, to_return = -1;
  while ( low <= high && to_return == -1 ) {
    middle = (low + high) / 2;
    if ( sorted[middle].item_name == search_value.item_name )
      to_return = middle;
    else if ( sorted[middle].item_name > search_value.item_name )
      high = middle - 1;
    else
      low = middle + 1;
  }
  return to_return;
}
int main() {
  const int kSize = 6;
  Produce my_produce[kSize] = {{"strawBerries", 4.52, "quart"},
          {"lemons", 2.12, "each"}, {"leTTuce", 2.68, "head"},
          {"potatoes", 3.14, "LB"}, {"corN", 2.34, "Dozen"},
           {"bAnAnAs", 0.32, "lb"}};
  for ( int i = 0; i < kSize; ++i ) {
    Print(my_produce[i]);
    ConvertToLower(my_produce[i]);
  }
  InsertionSort(my_produce, kSize);
  cout << "\nAfter sorting:\n";
  for ( int i = 0; i < kSize; ++i )
    Print(my_produce[i]);
  Produce to_find;
  cin >> to_find.item_name >> to_find.unit_price >> to_find.units;
  cout << BinarySearch(my_produce, kSize, to_find) << endl;
/*  Produce p;
  // can access the public members using the . operator
  p.item_name = "blueberries";
  p.unit_price = 3.65;
  p.units = "pint";
  Print(p);
  Produce p2 = {"strawberries",4.52,"quart"};
	Print(p2);
*/
  return 0;
}


