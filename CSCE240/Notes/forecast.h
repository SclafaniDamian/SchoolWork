// Copyright 2022 CSCE240-003 bhipp
// 10/11/2022 - creating a Forecast class that has Temp objects as
// data members
#ifndef _FORECAST_H_
#define _FORECAST_H_

#include<temp.h>
class Forecast {
 public:
  // default constructor
  Forecast();
  // constructor
  Forecast(Temp low_temp, Temp high_temp, double p);

  void Print() const;

  // accessor
  Temp GetLow() const { return low_; }
  Temp GetHigh() const { return high_; }
  double GetPrecipitation() const { return chance_of_precipitation_; }

  // mutator functions to update the values of the private data members
  // precondition: function is sent a Temp object
  // postcondition: will change low_ to t if t < high_
  void SetLow(Temp t);
  // precondition: function is sent a Temp object
  // postcondition: will change high_ to t if t > low_
  void SetHigh(Temp t);
  // precondition: function is sent a double (should be between 0 and 100)
  // postcondition: function will set chance_of_precipititaion to p if
  //                p is between 0 and 100
  void SetPrecipitation(double p);

 private:
  Temp low_;
  Temp high_;
  double chance_of_precipitation_;
};
#endif  // _FORECAST_H_