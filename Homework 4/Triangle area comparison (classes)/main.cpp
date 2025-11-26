#include <iostream>
#include "Triangle.h"
using namespace std;

int main() {
    Triangle triangle1;
    Triangle triangle2;
    double b, h;

    // Read and set base and height for triangle1.
    cin >> b >> h;
    triangle1.SetBase(b);
    triangle1.SetHeight(h);

    // Read and set base and height for triangle2.
    cin >> b >> h;
    triangle2.SetBase(b);
    triangle2.SetHeight(h);
    cout << "Triangle with smaller area:" << endl;

    // Compare the areas and output the triangle with the smaller area.
    if (triangle1.GetArea() < triangle2.GetArea()) {
        triangle1.PrintInfo();
    }
    else {
        triangle2.PrintInfo();
    }

    return 0;
}
