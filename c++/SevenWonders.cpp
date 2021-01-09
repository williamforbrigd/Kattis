#include <iostream>
#include <string>

//Copy a string to a char array
#include <bits/stdc++.h>

//power function
#include <math.h>


using namespace std;

/*
int minArr(int arr[], int n) {
    int temp = arr[0];
    for(int i=0; i<n; i++) {
        if(temp > arr[i]) {
            temp = arr[i];
        }
    }
    return temp;
}
*/

int main() {
    string in;
    cin >> in;
    int n = in.length();
    //cout << "n" << n << endl;
    char arr[n+1];
    strcpy(arr, in.c_str());
    int t = 0, c = 0, g = 0, sum, sets;

    for(int i=0; i < n; i++) {
        if(arr[i] == 'T') t++;
        else if(arr[i] == 'C') c++;
        else if(arr[i] == 'G') g++;
    }
    //cout << t << " " << c << " " << g << endl;
    int nums[] = {t,c,g};
    //int smallest = minArr(nums, sizeof(nums));
    //cout << smallest << endl;

    int small = nums[0];
    int size = sizeof(nums)/sizeof(*nums);
    for(int i=0; i<size; i++) {
        if(small>nums[i]) {
            small = nums[i];
        }
    }
    sum = pow(t,2) + pow(c,2) + pow(g,2) + (7*small);
    cout << sum << endl;
    return 0;
}

