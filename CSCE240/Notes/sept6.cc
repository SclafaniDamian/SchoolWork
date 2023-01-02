// Copyright 2022 Damian Sclafani CSCE 240-003
// user definded functions - separate compilations - file input
#include<triangles.h>	// including our suer defined functions

#include<iostream>
using std::cout;
using std::endl;
using std::cin;
#include<fstream>  // file stream
using std::ifstream;	// input stream class

int main() {
  double l1, l2, l3;
	// create an input_file object to recieve input and open
	// the text file trianlge-sides
	ifstream my_file("triangle-sides.txt");
	my_file >> l1 >> l2 >> l3;
	while (my_file.good()) {
		if (IsTriangleSides(l1, l2, l3)) {
			cout << l1 << ", " << l2 << ", and " << l3 
				 	<< " are valid triangle side lengths" << endl;
			if (IsScaleneTriangleSides(l1, l2, l3)) {
				cout << "It's scalene" << endl;
			}
			else {
				cout << "Not scalene" << endl;
			}
		}
		else {
			cout << l1 << ", " << l2 << ", and " << l3 
				 	<< " are NOT valid triangle side lengths" << endl;
		}
		my_file >> l1 >> l2 >> l3;
	}
	my_file.close();
	return 0;
}


