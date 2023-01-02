// Copyright 2022 CSCE240-003 Damian Sclafani
// implement the member functions for the HistoricSite class in this file
#include<geographiclocation.h>
#include<historicsite.h>
#include<iostream>
#include<string>
using std::string;
using std::cout;
using std::endl;

namespace csce240_sites {

  // constructor
  HistoricSite::HistoricSite(string desc, int year, double latitude,
   double longitude) {
    desc_ = "";
    year_ = 0;
    SetDescription(desc);
    SetYearEstablished(year);
    SetLatitude(latitude);
    SetLongitude(longitude);
  }

  // destructor
  HistoricSite::~HistoricSite() {}

  // Sets the description
  void HistoricSite::SetDescription(string desc) {
    desc_ = desc;
  }

  // Sets the year
  void HistoricSite::SetYearEstablished(int year) {
    year_ = year;
  }

  // Prints out the historic site information
  void HistoricSite::Print() {
    cout << "Historic Site" << endl;
    cout << "Established: " << year_ << endl;
    cout << "Location: ";
    if (GetLatitude() >= 0) {
      cout << GetLatitude() << "\u00B0 N, ";
    } else {
      cout << (GetLatitude()*-1) << "\u00B0 S, ";
    }
    if (GetLongitude() >= 0) {
      cout << GetLongitude() << "\u00B0 E" << endl;
    } else {
      cout << (GetLongitude()*-1) << "\u00B0 W" << endl;
    }
    cout << "Description: " << desc_;
  }

}   // namespace csce240_sites
