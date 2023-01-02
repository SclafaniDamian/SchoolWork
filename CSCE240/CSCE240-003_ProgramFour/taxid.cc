// Copyright 2022 CSCE240-003 Damian Sclafani
#include<taxid.h>
#include<iostream>
#include<string>
using std::string;

// implement the TaxId class' member functions

// Initialize mask_
string TaxId::mask_ = "XXXXX####";
// constructor
TaxId::TaxId(string id) {
  SetId(id);
  mask_ = "XXXXX####";
}

// Sets the mask to an appropriate value
// Checks that the length is correct first, then checks
// each character to make sure they all are an 'X' or '#'
// If checks don't fail, mask is set to the given value
void TaxId::SetMask(string mask) {
  bool correct = true;
  if (mask.length() == 9) {
    for (int i = 0; i < 9; i++) {
      if (mask[i] != '#' || mask[i] != 'X') {
        correct = false;
      }
    }
    if (correct) {
      mask_ = mask;
    }
  }
}

// Returns the value set as the mask
string TaxId::GetMask() {
  return mask_;
}

// Sets the value of the tax ID
void TaxId::SetId(string id) {
  if (id.length() == 9) {
    id_ = id;
  } else if (id.length() == 11) {
    if (id[4] == '-' && id[7] == '-') {
      string newId = "";
      for (int i = 0; i < 11; i++) {
        if (id[i] != '-') {
          newId = newId + id[i];
        }
      }
      id_ = newId;
    }
  }
}

// Returns the value set as the tax ID with the mask
string TaxId::GetId() const {
  return id_;
  /*string maskedId = "";
  if (id_.length() == 9) {
    for (int i = 0; i < 9; i++) {
      if (mask_[i] == 'X') {
        maskedId += "X";
      } else {
        maskedId += id_[i];
      }
    }
  } else if (id_.length() == 11) {
    for (int i = 0; i < 11; i++) {
      if (mask_[i] == 'X') {
        maskedId += "X";
      } else {
        maskedId += id_[i];
      }
    }
  }
  return maskedId; */
}
