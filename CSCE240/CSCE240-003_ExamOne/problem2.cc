// Copyright 2022 Damian Sclafani CSCE240-003
#include<iostream>
using std::cin;
using std::cout;
using std::endl;
#include<fstream>
using std::ifstream;
#include<string>
using namespace std;

int main() {
	string item;
	int num;
	string highest_item = "";
	int highest_num = 0;
	string lowest_item = "";
	int lowest_num = 0;
	int total_num = 0;
	ifstream my_file("inventory.txt");
	my_file >> item >> num;
	while(my_file.good()) {
		if(num > highest_num) {
			highest_num = num;
			highest_item = item;
		}
		if(num < lowest_num) {
			lowest_num = num;
			lowest_item = item;
		}
		total_num += num;
		my_file >> item >> num;
	}
	my_file.close();
	cout << "Highest inventory item: " << highest_item << " quanitity: " << highest_num;
	cout << "Lowest inventory item: " << lowest_item << " quanitity: " << lowest_num;
	cout << "Total inventory: " << total_num;
	return 0;
}