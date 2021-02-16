#include <iostream>

using namespace std;

int main() {
    int n;
    cin >> n;

    int a = n * 45 + (n / 2) * 5 + ((n + 1)/2 - 1) * 15;
    cout << a / 60 + 9 << ":" << a % 60 << endl;

    return 0; 
}
