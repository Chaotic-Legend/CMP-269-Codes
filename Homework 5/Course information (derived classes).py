class Course:
    # Constructor with number and title.
    def __init__(self, number, title):
        self.number = number
        self.title = title

    # Print course number and title.
    def print_info(self):
        print('Course Information:')
        print(f'   Course Number: {self.number}')
        print(f'   Course Title: {self.title}')

class OfferedCourse(Course):
    # Constructor with all attributes, including base class attributes.
    def __init__(self, number, title, instructor_name, location, class_time):
        super().__init__(number, title)
        self.instructor_name = instructor_name
        self.location = location
        self.class_time = class_time


if __name__ == "__main__":
    course_number = input()
    course_title = input()

    o_course_number = input()
    o_course_title = input()
    instructor_name = input()
    location = input()
    class_time = input()
    
    my_course = Course(course_number, course_title)
    my_course.print_info()
    
    my_offered_course = OfferedCourse(o_course_number, o_course_title, instructor_name, location, class_time)
    my_offered_course.print_info()

    print(f'   Instructor Name: {my_offered_course.instructor_name}')
    print(f'   Location: {my_offered_course.location}')
    print(f'   Class Time: {my_offered_course.class_time}')
