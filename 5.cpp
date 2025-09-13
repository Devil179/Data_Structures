#include <iostream>
using namespace std;

int sum(const int values[], int n) {
  int res = 0;
  for (int i = 0; i < n; i++) {
    res += values[i];
  }
  return res;
}

int main() {
  int arr[] = {10, 20, 30, 40, 50};
  int n = sizeof(arr) / sizeof(arr[0]);
  int res = sum(arr, n);
  cout << "Sum: " << res << endl;
  return 0;
}
