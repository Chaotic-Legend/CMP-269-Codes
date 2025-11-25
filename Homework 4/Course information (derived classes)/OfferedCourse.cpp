#include "OfferedCourse.h"

// Set instructor name
void OfferedCourse::SetInstructorName(string name) {
    instructorName = name;
}

// Set location
void OfferedCourse::SetLocation(string loc) {
    location = loc;
}

// Set class time
void OfferedCourse::SetClassTime(string time) {
    classTime = time;
}

// Get instructor name
string OfferedCourse::GetInstructorName() const {
    return instructorName;
}

// Get location
string OfferedCourse::GetLocation() const {
    return location;
}

// Get class time
string OfferedCourse::GetClassTime() const {
    return classTime;
}

// Print course info, including base class fields
void OfferedCourse::PrintInfo() const {
    Course::PrintInfo();
}
