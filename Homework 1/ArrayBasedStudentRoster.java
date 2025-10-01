// CMP 269: Programming Methods III - Homework 1 - Isaac D. Hoyos

import java.util.Arrays;

// ArrayBasedStudentRoster Class implementing ArrayBasedStudentRosterInterface.
public class ArrayBasedStudentRoster implements ArrayBasedStudentRosterInterface {
    private CourseSection courseSection;
    private Student[] studentsRoster;
    private int numberOfStudents;
    private static final int DEFAULT_CAPACITY = 10;
    public ArrayBasedStudentRoster(CourseSection courseSection) {
        this(courseSection, DEFAULT_CAPACITY);
    }

    public ArrayBasedStudentRoster(CourseSection courseSection, int capacity) {
        if (courseSection == null) {
            throw new IllegalArgumentException("Error: Null CourseSection.");
        }
        if (capacity <= 0) {
            throw new IllegalArgumentException("Error: Invalid Capacity.");
        }
        this.courseSection = courseSection;
        this.studentsRoster = new Student[capacity];
        this.numberOfStudents = 0;
    }

    @Override
    public void setCourseSection(CourseSection courseSection) {
        if (courseSection == null) {
            throw new IllegalArgumentException("Error: Null CourseSection.");
        }
        this.courseSection = courseSection;
    }

    @Override
    public CourseSection getCourseSection() {
        return courseSection;
    }

    @Override
    public int getCurrentNumberOfStudents() {
        return numberOfStudents;
    }

    @Override
    public boolean isFull() {
        return numberOfStudents == studentsRoster.length;
    }

    @Override
    public boolean isEmpty() {
        return numberOfStudents == 0;
    }

    @Override
    public void add(Student student) {
        if (student == null) {
            throw new IllegalArgumentException("Error: Null Student.");
        }
        if (isFull()) {
            resize();
        }
        studentsRoster[numberOfStudents++] = student;
    }

    private void resize() {
        studentsRoster = Arrays.copyOf(studentsRoster, studentsRoster.length * 2);
    }

    @Override
    public Student remove() {
        if (isEmpty()) return null;
        Student removed = studentsRoster[--numberOfStudents];
        studentsRoster[numberOfStudents] = null;
        return removed;
    }

    @Override
    public Student remove(int index) {
        if (isEmpty() || index < 0 || index >= numberOfStudents) {
            return null;
        }
        Student removed = studentsRoster[index];
        for (int i = index; i < numberOfStudents - 1; i++) {
            studentsRoster[i] = studentsRoster[i + 1];
        }
        studentsRoster[numberOfStudents - 1] = null;
        numberOfStudents--;
        return removed;
    }

    @Override
    public Student get(int index) {
        if (isEmpty() || index < 0 || index >= numberOfStudents) return null;
        return studentsRoster[index];
    }

    @Override
    public Student replace(Student student, int index) {
        if (student == null || index < 0 || index >= numberOfStudents) {
            return null;
    }
    Student old = studentsRoster[index];
    studentsRoster[index] = student;
    return old;
    }

    @Override
    public void clear() {
        Arrays.fill(studentsRoster, 0, numberOfStudents, null);
        numberOfStudents = 0;
    }

    @Override
    public boolean contains(Student student) {
        if (isEmpty() || student == null) return false;
        for (int i = 0; i < numberOfStudents; i++) {
            if (studentsRoster[i].equals(student)) return true;
        }
        return false;
    }

    @Override
    public Student[] getStudentsRoster() {
        return Arrays.copyOf(studentsRoster, numberOfStudents);
    }

    @Override
    public void setStudentsRoster(Student[] studentsRoster) {
        if (studentsRoster == null) {
            throw new IllegalArgumentException("Error: Null Students Roster.");
        }
        this.studentsRoster = Arrays.copyOf(studentsRoster, studentsRoster.length);
        this.numberOfStudents = studentsRoster.length;
    }

    @Override
    public Student getOldestStudent() {
        if (isEmpty()) return null;
        Student oldest = studentsRoster[0];
        for (int i = 1; i < numberOfStudents; i++) {
            if (studentsRoster[i].getAge() > oldest.getAge()) {
                oldest = studentsRoster[i];
            }
        }
        return oldest;
    }

    @Override
    public Student getYoungestStudent() {
        if (isEmpty()) return null;
        Student youngest = studentsRoster[0];
        for (int i = 1; i < numberOfStudents; i++) {
            if (studentsRoster[i].getAge() < youngest.getAge()) {
                youngest = studentsRoster[i];
            }
        }
        return youngest;
    }
}