#ifndef COURSEH
#define COURSEH

#include <iostream>
#include <string>
using namespace std;

class Course {
private:
    string courseNumber;
    string courseTitle;

public:
    // Mutators
    void SetCourseNumber(string num);
    void SetCourseTitle(string title);

    // Accessors
    string GetCourseNumber() const;
    string GetCourseTitle() const;

    // Print function
    void PrintInfo() const;
};

#endif
