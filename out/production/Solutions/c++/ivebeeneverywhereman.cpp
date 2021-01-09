#include <iostream>
#include <bits/stdc++.h>
using namespace std;

//this is not compiling
/*
int countDistinct(string arr[], int n) {
  int res = 1;
  for(int i=1; i < n; i++) {
    int j=0; 
    for(j=0; j < i; j++) {
      if(arr[i] == arr[j])
        break;

      if(i==j)
        res++;
    }
  }
 return res; 
}
*/

int main() {
 int n;
 cin >> n;
 for(int i=0; i < n; i++) {
  int k;
  int d=0;
  cin >> k;
  string a[k], b[k];
  for(int j=0; j < k; j++) {
    cin >> b[j];
    for(int x=0; x < k; x++) {
      if(a[j]==b[x])
        break;
      if(j==x-1) {
        b[d]=a[j];
        d++;
      }
    }
  }
  cout << d << "\n";
 }
}

