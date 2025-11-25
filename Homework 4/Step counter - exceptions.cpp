#include <iostream>
#include <iomanip>
#include <stdexcept>
using namespace std;

/* This function converts the number of steps into miles and throws an exception if the step count is negative. */ 
double StepsToMiles(int steps) {
    if (steps < 0) {
        throw runtime_error("Exception: Negative step count entered.");
    }
    return steps / 2000.0;
}

int main() {
    int steps;

    // This statement reads the user's step count.
    cin >> steps;

    // This statement ensures that all floating-point output displays two digits after the decimal point.
    cout << fixed << setprecision(2);

    try {
        // This statement calls the StepsToMiles function and stores the returned miles.
        double miles = StepsToMiles(steps);

        // This statement outputs the calculated miles value.
        cout << miles << endl;
    }
    catch (runtime_error& e) {
        // This statement outputs the exception message if a runtime_error is thrown.
        cout << e.what() << endl;
    }

    return 0;
}
