// Copyright 2022 CSCE240-003 bhipp
// Implement the functionality of the Forecast class
#include<forecast.h>
#include<temp.h>  // even though forecast.h includes temp.h, we'll explicitly
                  // include the headers with the functions, etc we need
#include<iostream>
using std::cout;
using std::endl;

// default constructor
                     // member initializer list allows us to call the
                     // constructor for our data member objects in the way
                     // that we like. Can't call the constructor inside the
                     // the body of the function.
Forecast::Forecast() : low_(0, "Fahrenheit"), high_(100, "Fahrenheit") {
  chance_of_precipitation_ = 0;
}

// constructor with values to initialize
Forecast::Forecast(Temp low_temp, Temp high_temp, double p) : low_(low_temp),
  high_(high_temp) {
  chance_of_precipitation_ = (p >= 0 && p <= 100 ? p : 0);
}

void Forecast::Print() const {
  cout << "Forecast low: " << low_ << "; Forecast high: " << high_
       << "; Chance of precipitation: " << chance_of_precipitation_
       << "%" << endl;
}

void Forecast::SetLow(Temp l) {
  if ( l < high_ ) {  // using the overloaded < operator from the Temp class
    low_.SetValue(l.GetValue());
    low_.SetMeasure(l.GetMeasure());
  }
}

void Forecast::SetHigh(Temp h) {
  if ( h > low_ ) {  // using the overloaded > operator from the Temp class
    // can't say high_.value_ since value_ is private in the Temp class
    high_.SetValue(h.GetValue());
    high_.SetMeasure(h.GetMeasure());
  }
}

void Forecast::SetPrecipitation(double p) {
  if ( p >= 0 && p <= 100 )
    chance_of_precipitation_ = p;
}



