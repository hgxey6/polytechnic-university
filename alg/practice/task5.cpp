#include <iostream>
#include <cmath>

using namespace std;

// Сложность Sqrt(N)
bool is_prime(int x) { 
    for (int i = 2; i <= sqrt(x); i++) {
        if (x % i == 0) {
            return false;
        }
    }

    return true;
}


int main() {
    int n;
    cin >> n;
    bool answer = is_prime(n);
    cout << n << " is prime: " << answer << endl;

    return 0;
}

