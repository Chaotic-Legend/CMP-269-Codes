// CMP 269: Programming Methods III - Homework 1 - Isaac D. Hoyos

// Student Class extending Person and implementing StudentInterface.
public class Student extends Person implements StudentInterface {
    private int emplid;
    private String yearOfStudy;
    private CourseSection[] courseSections;
    public Student(int emplid, String ssn, String name, int age, 
                   String yearOfStudy, CourseSection[] courseSections) {
        super(name, age, ssn);
        setEmplid(emplid);
        setYearOfStudy(yearOfStudy);
        setCourseSections(courseSections);
    }

    @Override
    public int getEmplid() {
        return emplid;
    }

    @Override
    public void setEmplid(int emplid) {
        if (emplid <= 0) {
            throw new IllegalArgumentException("Error: Null/Empty EMPLID.");
        }
        this.emplid = emplid;
    }

    @Override
    public String getYearOfStudy() {
        return yearOfStudy;
    }

    @Override
    public void setYearOfStudy(String yearOfStudy) {
        if (yearOfStudy == null || yearOfStudy.trim().isEmpty()) {
            throw new IllegalArgumentException("Error: Null/Empty Year of Study.");
        }
        this.yearOfStudy = yearOfStudy;
    }

    @Override
    public CourseSection[] getCourseSections() {
        return courseSections;
    }

    @Override
    public void setCourseSections(CourseSection[] courseSections) {
        if (courseSections == null || courseSections.length == 0) {
            throw new IllegalArgumentException("Error: Null/Empty Course Sections.");
        }
        for (CourseSection cs : courseSections) {
            if (cs == null) {
                throw new IllegalArgumentException("Error: Null Course Sections.");
            }
        }
        this.courseSections = courseSections;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Student)) return false;
        Student other = (Student) obj;
        if (emplid != other.emplid) return false;
        if (!super.equals(obj)) return false;
        if (!yearOfStudy.equals(other.yearOfStudy)) return false;
        if (courseSections.length != other.courseSections.length) return false;
        for (int i = 0; i < courseSections.length; i++) {
            if (!courseSections[i].equals(other.courseSections[i])) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Student [EMPLID: ").append(emplid)
          .append(", SSN: ").append(getSsn())
          .append(", Name: ").append(getName())
          .append(", Age: ").append(getAge())
          .append(", Year of Study: ").append(yearOfStudy)
          .append(", Course Sections: ");
        for (int i = 0; i < courseSections.length; i++) {
            sb.append(courseSections[i].getId());
            if (i < courseSections.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}