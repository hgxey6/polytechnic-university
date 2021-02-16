#include <iostream>

using namespace std;

int main() {
    int minute;
    cin >> minute;
    int h = minute / 60;
    int m = minute % 60;
    
    while( h > 23) {
	 h -= 24;
    }

    cout << h << ":" <<  m << endl;
    return 0;
}
