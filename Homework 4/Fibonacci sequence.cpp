#include <iostream>
using namespace std;

int Fibonacci(int n) {
    // Return -1 for negative index values.
    if (n < 0) {
        return -1;
    }
    
    // Return 0 for Fibonacci(0).
    if (n == 0) {
        return 0;
    }
    
    // Return 1 for Fibonacci(1).
    if (n == 1) {
        return 1;
    }

    int first = 0;
    int second = 1;
    int next = 0;

    // Use a loop to build the Fibonacci sequence up to n.
    for (int i = 2; i <= n; i++) {
        next = first + second;
        first = second;
        second = next;
    }

    return next;
}

int main() {
    int startNum;
    cin >> startNum;
    cout << "Fibonacci(" << startNum << ") is " << Fibonacci(startNum) << endl;

    return 0;
}
