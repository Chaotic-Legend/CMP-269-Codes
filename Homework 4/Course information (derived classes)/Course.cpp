#include "Course.h"

// Set the course number
void Course::SetCourseNumber(string num) {
    courseNumber = num;
}

// Set the course title
void Course::SetCourseTitle(string title) {
    courseTitle = title;
}

// Get the course number
string Course::GetCourseNumber() const {
    return courseNumber;
}

// Get the course title
string Course::GetCourseTitle() const {
    return courseTitle;
}

// Print course information
void Course::PrintInfo() const {
    cout << "Course Information:" << endl;
    cout << "   Course Number: " << courseNumber << endl;
    cout << "   Course Title: " << courseTitle << endl;
}
