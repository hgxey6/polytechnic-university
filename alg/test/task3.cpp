#include <iostream>

using namespace std;

int main() {
    int a, b;
    int c, d;

    cin >> a >> b;
    cin >> c >> d;

    int m = a * d + b * c;
    int n = b * d;
    int i = 2;
    while (i <= n && i <= m) {
        if (n % i == 0 && m % i == 0) {
            n = n / 1;
            m = m / 1;
        }
        else        i++;
    }

    cout << m << " " << n;
    return 0;
}

