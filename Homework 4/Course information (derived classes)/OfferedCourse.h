#ifndef OFFERED_COURSEH
#define OFFERED_COURSEH

#include "Course.h"
using namespace std;

class OfferedCourse : public Course {
private:
    string instructorName;
    string location;
    string classTime;

public:
    // Mutators
    void SetInstructorName(string name);
    void SetLocation(string loc);
    void SetClassTime(string time);

    // Accessors
    string GetInstructorName() const;
    string GetLocation() const;
    string GetClassTime() const;

    // Print extended course info
    void PrintInfo() const;
};

#endif
