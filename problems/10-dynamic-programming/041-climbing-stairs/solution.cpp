// Judged input: one argument per line.
//   line 1: n (int)
// Judged output: values separated by single spaces, booleans as true/false.

#include <algorithm>
#include <iostream>
#include <sstream>
#include <string>
#include <vector>
using namespace std;

template <typename T> string show(const vector<T>& values) {
  string out;
  for (size_t index = 0; index < values.size(); index++) {
    if (index) out += " ";
    ostringstream text;
    text << values[index];
    out += text.str();
  }
  return out;
}

string show(bool value) { return value ? "true" : "false"; }
template <typename T> string show(T value) { ostringstream text; text << value; return text.str(); }

vector<int> readInts(const string& line) {
  vector<int> values;
  istringstream stream(line);
  for (int value; stream >> value;) values.push_back(value);
  return values;
}

vector<double> readDoubles(const string& line) {
  vector<double> values;
  istringstream stream(line);
  for (double value; stream >> value;) values.push_back(value);
  return values;
}

vector<string> readStrs(const string& line) {
  vector<string> values;
  istringstream stream(line);
  for (string value; stream >> value;) values.push_back(value);
  return values;
}

// Write your solution below, then Submit to run the judged cases.
vector<int> solution(int n) {
  return {};
}

int main() {
  string line;
  vector<string> lines;
  while (getline(cin, line)) lines.push_back(line);
  int n = stoi(lines[0]);
  cout << show(solution(n)) << endl;
  return 0;
}
