// Copyright 2022 Damian Sclafani CSCE240-003
#include<word_search_functions.h>
#include<iostream>
using std::endl;
using std::cout;

bool ReadWordSearch(string file_name, char word_search[][kSize]) {
  return word_search[][kSize].good();
}

void PrintWordSearch(const char word_print[][kSize]) {
  for (int i = 0; i < kSize; i++) {
    for (int j = 0; j < kSize; j++) {
      cout << word_print[i][j] << "";
    }
    cout << endl;
  }
}

Position FindWordRight(const char word_search[][kSize], string to_find) {
  int matched = 0;
  Position found = {-1, -1};
  for (int r = 0; r < kSize; r++) {
    for (int c = 0; c < kSize; c++) {
      matched = 0;
      for (int wp = 0; wp < to_find.length(); wp++) {
        if ((c+wp) < kSize) {
          if (to_find[wp] == word_search[r][c+wp]) {
            matched++;
          }
          if (matched == to_find.length()) {
            found.row = r;
            found.col = c;
            return found;
          }
        }
      }
    }
  }
  return found;
}

Position FindWordLeft(const char word_search[][kSize], string to_find) {
  int matched = 0;
  Position found = {-1, -1};
  for (int r = 0; r < kSize; r++) {
    for (int c = 0; c < kSize; c++) {
      matched = 0;
      for (int wp = 0; wp < to_find.length(); wp++) {
        if ((c-wp) > 0) {
          if (to_find[wp] == word_search[r][c-wp]) {
            matched++;
          }
          if (matched == to_find.length()) {
            found.row = r;
            found.col = c;
            return found;
          }
        }
      }
    }
  }
  return found;
}

Position FindWordDown(const char word_search[][kSize], string to_find) {
  int matched = 0;
  Position found = {-1, -1};
  for (int r = 0; r < kSize; r++) {
    for (int c = 0; c < kSize; c++) {
      matched = 0;
      for (int wp = 0; wp < to_find.length(); wp++) {
        if ((c+wp) < kSize) {
          if (to_find[wp] == word_search[r+wp][c]) {
            matched++;
          }
          if (matched == to_find.length()) {
            found.row = r;
            found.col = c;
            return found;
          }
        }
      }
    }
  }
  return found;
}

Position FindWordUp(const char word_search[][kSize], string to_find) {
  int matched = 0;
  Position found = {-1, -1};
  for (int r = 0; r < kSize; r++) {
    for (int c = 0; c < kSize; c++) {
      matched = 0;
      for (int wp = 0; wp < to_find.length(); wp++) {
        if ((c-wp) > 0) {
          if (to_find[wp] == word_search[r-wp][c]) {
            matched++;
          }
          if (matched == to_find.length()) {
            found.row = r;
            found.col = c;
            return found;
          }
        }
      }
    }
  }
  return found;
}

Position FindWordDiagonal(const char word_search[][kSize], string to_find) {
  int matched = 0, matched2 = 0;
  Position found = {-1, -1};
  for (int r = 0; r < kSize; r++) {
    for (int c = 0; c < kSize; c++) {
      matched = 0;
      for (int wp = 0; wp < to_find.length(); wp++) {
        if ((r - wp) >= 0 && (c - wp) >= 0) {
          if (to_find[wp] == word_search[r-wp][c-wp]) {
            matched++;
          }
          if (matched == to_find.length()) {
            found.row = r;
            found.col = c;
            return found;
          }
        }
        if ((r + wp) < 0 && (c = wp) < 0) {
          if (to_find[wp] == word_search[r+wp][c+wp]) {
            matched2++;
          }
          if (matched2 == to_find.length()) {
            found.row = r;
            found.col = c;
            return found;
          }
        }
      }
    }
  }
  return found;
}