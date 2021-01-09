
#include <iostream>
using namespace std;

int nums[10];

int countDistinct(int arr[], int n) {
    int count = 1;
    for(int i = 1; i < n; i++) {
        int j = 0;
        for(j = 0; j < i; j++) {
            if(arr[i] == arr[j]) {
                break;
            }
        }
        if(i == j)
            count++;
    }
    return count;
 }

int main() {
    int n;
    for(int i = 0; i < 10; i++) {
        cin >> n;
        if(n < 1000) {
            nums[i] = n%42;
        }
    }
    cout << countDistinct(nums,10) << endl;
    return 0;
    
}