// CMP 269: Programming Methods III - Homework 1 - Isaac D. Hoyos

public class Driver {
    public static void main(String[] args) {
        // === PERSON TEST ===
        Person person = new Person("John Adams", 30, "111-22-3333");

        // === COURSES ===
        Course course = new Course("CMP 269", "Programming Methods III", 4);
        Course course2 = new Course("MAT 232", "Linear Algebra", 4);

        // === INSTRUCTOR ===
        Instructor instructor = new Instructor("Professor Green", 25359142, 45, "987-65-4321", 2020);

        // === COURSE SECTIONS ===
        CourseSection section1 = new CourseSection(course, instructor);
        CourseSection section2 = new CourseSection(course2, instructor);

        // === STUDENTS ===
        CourseSection[] sections1 = { section1 };
        Student student1 = new Student(24195352, "123-45-6789", "Jane Miller", 21, "Sophomore", sections1);
        Student student5 = new Student(24195356, "101-01-0101", "Charlie Emily", 18, "Junior", sections1);

        CourseSection[] sections2 = { section1, section2 };
        Student student2 = new Student(24195353, "555-66-7777", "Isaac Hoyos", 22, "Senior", sections2);
        Student student3 = new Student(24195354, "999-11-2222", "Jakub Nastała", 23, "Senior", sections1);
        Student student4 = new Student(24195355, "333-44-5555", "Mark Lee", 19, "Junior", sections2);

        // === PRINT BASICS ===
        System.out.println(person + "\n");
        System.out.println(course + "\n");
        System.out.println(course2 + "\n");
        System.out.println(instructor + "\n");
        System.out.println(section1 + "\n");
        System.out.println(section2 + "\n");
        System.out.println(student1 + "\n");
        System.out.println(student2 + "\n");
        System.out.println(student3 + "\n");
        System.out.println(student4 + "\n");
        System.out.println(student5 + "\n");

        // === ROSTER TEST ===
        ArrayBasedStudentRoster roster = new ArrayBasedStudentRoster(section1, 2);
        System.out.println("=== ADD STUDENTS TO ROSTER ===");
        roster.add(student1);
        roster.add(student2);
        roster.add(student3);
        roster.add(student4);
        roster.add(student5);
        printRoster(roster);

        // === REMOVE LAST STUDENT ===
        System.out.println("\n=== REMOVE LAST STUDENT ===");
        Student removedLast = roster.remove();
        System.out.println("Removed: " + removedLast + "\n");
        printRoster(roster);

        // === REMOVE STUDENT AT INDEX 0 ===
        System.out.println("\n=== REMOVE STUDENT AT INDEX 0 ===");
        Student removedAtIndex = roster.remove(0);
        System.out.println("Removed: " + removedAtIndex + "\n");
        printRoster(roster);

        // === REPLACE STUDENT AT INDEX 0 ===
        System.out.println("\n=== REPLACE STUDENT AT INDEX 2 ===");
        roster.replace(student4, 0);
        printRoster(roster);

        // === CONTAINS TEST ===
        System.out.println("\n=== CHECK CONTAINS ===");
        System.out.println("Contains Jane Miller? " + roster.contains(student2));
        System.out.println("Contains Jakub Nastała? " + roster.contains(student3));

        // === OLDEST & YOUNGEST STUDENTS ===
        System.out.println("\n=== OLDEST & YOUNGEST STUDENTS ===");
        System.out.println("Oldest: " + roster.getOldestStudent());
        System.out.println("Youngest: " + roster.getYoungestStudent());
    }
    private static void printRoster(ArrayBasedStudentRoster roster) {
        System.out.println("Current Roster (" + roster.getCurrentNumberOfStudents() + " Students):");
        for (int i = 0; i < roster.getCurrentNumberOfStudents(); i++) {
            System.out.println("[" + i + "] " + roster.get(i));
        }
    }
}
