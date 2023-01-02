// Copyright 2022 CSCE240-003 Damian Sclafani
// implement the member functions for the GeographicLocation class in this file
#include<geographiclocation.h>
#include<iostream>
using std::cout;
using std::endl;

namespace csce240_sites {

  // constructor
  GeographicLocation::GeographicLocation(double latitude, double longitude) {
    latitude_ = 0;
    longitude_ = 0;
    SetLatitude(latitude);
    SetLongitude(longitude);
  }

  // deconstructor
  GeographicLocation::~GeographicLocation() {}

  // Sets the value of the latitude
  void GeographicLocation::SetLatitude(double latitude) {
    if ((-90 < latitude) && (latitude < 90)) {
      latitude_ = latitude;
    }
  }

  // Sets the value of the longitude
  void GeographicLocation::SetLongitude(double longitude) {
    if ((-180 < longitude) && (longitude < 180)) {
      longitude_ = longitude;
    }
  }

  // Prints out the latitude and longitude
  void GeographicLocation::Print() {
    if (latitude_ >= 0) {
      cout << latitude_ << "\u00B0 N, ";
    } else {
      cout << (latitude_*-1) << "\u00B0 S, ";
    }
    if (longitude_ >= 0) {
      cout << longitude_ << "\u00B0 E";
    } else {
      cout << (longitude_*-1) << "\u00B0 W";
    }
  }

}   // namespace csce240_sites
