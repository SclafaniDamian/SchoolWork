// Copyright 2022 CSCE240
// Exam 2 problem 2 implement the Volume class
#include"volume.h"
#include<iostream>
#include<string>
using std::string;

// constructor
Volume::Volume(double q, string m) : quantity_(0) {
  SetQuantity(q);
  measure_ = "ounces";
  SetMeasure(m);
}

// Gets the quantity
double Volume::GetQuantity() const {
  return quantity_;
}

// Gets the measure type
string Volume::GetMeasure() const {
  return measure_;
}

// Sets the quanity
void Volume::SetQuantity(double q) {
  if (q > 1) {
    quantity_ = q;
  } else {
    quantity_ = 0;
  }
}

// Sets the measure value
void Volume::SetMeasure(string m) {
  if (m == "ounces" || m == "tablespoons" || m == "teaspoons" || m == "cups") {
    measure_ = m;
  }
}

// Converts the measure and volume if changed
void Volume::Convert(string m) {
  if (m == "ounces" && measure_ != "ounces") {
    if (measure_ == "tablespoons") {
      quantity_ = quantity_ * 2;
    } else if (measure_ == "teaspoons") {
      quantity_ = quantity_ * 6;
    } else if (measure_ == "cups") {
      quantity_ = quantity_ * 8;
    }
    measure_ = m;
  } else if (m == "tablespoons" && measure_ != "tablespoons") {
    if (measure_ == "ounces") {
      quantity_ = quantity_ / 2;
    } else if (measure_ == "teaspoons") {
      quantity_ = quantity_ * 3;
    } else if (measure_ == "cups") {
      quantity_ = quantity_ / 16;
    }
    measure_ = m;
  } else if (m == "teaspoons" && measure_ != "teaspoons") {
    if (measure_ == "tablespoons") {
      quantity_ = quantity_ * 3;
    } else if (measure_ == "ounces") {
      quantity_ = quantity_ * 6;
    } else if (measure_ == "cups") {
      quantity_ = quantity_ * 48;
    }
    measure_ = m;
  } else if (m == "cups" && measure_ != "cups") {
    if (measure_ == "tablespoons") {
      quantity_ = quantity_ / 16;
    } else if (measure_ == "teaspoons") {
      quantity_ = quantity_ / 48;
    } else if (measure_ == "ounces") {
      quantity_ = quantity_ / 8;
    }
    measure_ = m;
  }
}

// Adds a new volume to an existing one
void Volume::Add(Volume v) {
  v.Convert(measure_);
  double newQuantity = quantity_ + v.GetQuantity();
  quantity_ = newQuantity;
}
