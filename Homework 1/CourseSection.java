// CMP 269: Programming Methods III - Homework 1 - Isaac D. Hoyos

// CourseSection Class implementing CourseSectionInterface.
public class CourseSection implements CourseSectionInterface {
    private static int nextId = 0;
    private int id;
    private Course course;
    private Instructor instructor;
    private boolean isSemesterFinished;

    public CourseSection() {
        this.course = null;
        this.instructor = null;
        this.isSemesterFinished = false;
        this.id = nextId++;
    }

    public CourseSection(Course course) {
        setCourse(course);
        this.instructor = null;
        this.isSemesterFinished = false;
        this.id = nextId++;
    }

    public CourseSection(Course course, Instructor instructor) {
        setCourse(course);
        setInstructor(instructor);
        this.isSemesterFinished = false;
        this.id = nextId++;
    }

    public CourseSection(Course course, Instructor instructor, boolean isSemesterFinished) {
        setCourse(course);
        setInstructor(instructor);
        this.isSemesterFinished = isSemesterFinished;
        this.id = nextId++;
    }

    @Override
    public Course getCourse() {
        return course;
    }

    @Override
    public void setCourse(Course course) {
        if (course == null || course.getCode() == null || course.getCode().isEmpty()) {
            throw new IllegalArgumentException("Error: Null/Empty Course.");
        }
        this.course = course;
    }

    @Override
    public boolean isSemesterFinished() {
        return isSemesterFinished;
    }

    @Override
    public void setIsSemesterFinished(boolean isSemesterFinished) {
        this.isSemesterFinished = isSemesterFinished;
    }

    @Override
    public Instructor getInstructor() {
        return instructor;
    }

    @Override
    public void setInstructor(Instructor instructor) {
        if (instructor != null) {
            if (instructor.getName() == null || instructor.getName().isEmpty()) {
                throw new IllegalArgumentException("Error: Null/Empty Instructor.");
            }
        }
        this.instructor = instructor;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof CourseSection)) return false;

        CourseSection other = (CourseSection) obj;

        boolean courseEqual = (course == null) ? other.course == null : course.equals(other.course);
        boolean instructorEqual = (instructor == null) ? other.instructor == null : instructor.equals(other.instructor);

        return id == other.id &&
               courseEqual &&
               instructorEqual &&
               isSemesterFinished == other.isSemesterFinished;
    }

    @Override
    public String toString() {
        return "Course Section [ID: " + id +
               ", Course: " + (course != null ? course.getCode() : "null") +
               ", Instructor: " + (instructor != null ? instructor.getName() : "null") +
               ", Semester Finished: " + isSemesterFinished + "]";
    }
}