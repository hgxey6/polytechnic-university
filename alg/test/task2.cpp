#include <iostream>

using namespace std;

int main() {
    int ss, mm, h;

    cin >> ss;

    mm = ss / 60;
    h = mm / 60;

    ss %= 60;
    mm %= 60;
    h %= 24;
	 
    cout << h << ":"<< mm << ":" << ss << endl;

    return 0;
}
