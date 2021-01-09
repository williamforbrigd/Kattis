#include <iostream>
#include <string>
using namespace std;

int main() {
    int months[] = {31,28,31,30,31,30,31,31,30,31,30,31};
    string weekDays[] = {"Wednesday", "Thursday", "Friday", "Saturday", "Sunday", "Monday", "Tuesday"};
    

    int d, m;
    cin >> d >> m;
    int day = d;
    for(int i=0; i < m-1; i++) {
        day += months[i];
    }
    cout << weekDays[day%7];
    return 0;
}