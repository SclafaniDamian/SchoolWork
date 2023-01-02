// Copyright 2022 CSCE240-003 Damian Sclafani
// Define the GeographicLocation class in this file. Place it in the
// namespace csce240_sites
#ifndef _GEOGRAPHICLOCATION_H_
#define _GEOGRAPHICLOCATION_H_

namespace csce240_sites {

class GeographicLocation {
 public:
  // Member functions:
  // - An explicit constructor that takes two double parameters, the first for
  //   the location's latitude, and the second for the
  //   location's longitude with default arguments of 0 for each.
  explicit GeographicLocation(double latitude = 0, double longitude = 0);

  // - A virtual destructor - the body of the function should be empty {}
  virtual ~GeographicLocation();

  // - SetLatitude that takes a double argument for the location's latitude
  //   if the argument is between -90 and 90 (inclusive), the latitude data
  //   member should be updated with the argument's value
  //   if the argument sent to the function is invalid, the location's latitude
  //   should remain unchanged.
  void SetLatitude(double latitude);

  // - SetLongitude that takes a double argument for the location's longitude
  //   if the argument is between -180 and 180 (inclusive), the longitude data
  //   member should be updated with the argument's value
  //   if the argument sent to the function is invalid, the
  //   location's longitude should remain unchanged.
  void SetLongitude(double longitude);

  // - GetLatitude should return a
  //   copy of the value of the latitude data member
  double GetLatitude() { return latitude_; }

  // - GetLongitude should return a
  //   copy of the value of the longitude data member
  double GetLongitude() { return longitude_; }

  // - A virtual Print function that displays the location as
  //     the absolute value of the latitude
  //     the degree symbol (use the unicode \u00B0)
  //     a space
  //     N (if the latitude is non-negative) or S (if the latitude is negative)
  //     a comma and a space
  //     the absolute value of the longitude
  //     the degree symbol (use the unicode \u00B0)
  //     a space
  //     E (if the longitude is non-negative) or W
  //     (if the longitude is negative)
  //   example expected output for the print function is provided in
  //   /output/correctglprint.txt
  virtual void Print();

 private:
  // The GeographicLocation class should have two private data members:
  // a double for the latitude and a double for the longitude.
  double latitude_;
  double longitude_;
};

}   // namespace csce240_sites
#endif  // _GEOGRAPHICLOCATION_H_
