// CMP 269: Programming Methods III - Homework 1 - Isaac D. Hoyos

//Course Class implementing CourseInterface.
public class Course implements CourseInterface {
    private String code;
    private String name;
    private int credits;
    private static final String DEFAULT_CODE = "UN";
    private static final String DEFAULT_NAME = "UN";
    private static final int DEFAULT_CREDITS = 0;

    public Course() {
        this.code = DEFAULT_CODE;
        this.name = DEFAULT_NAME;
        this.credits = DEFAULT_CREDITS;
    }

    public Course(String code, String name, int credits) {
        setCode(code);
        setName(name);
        setCredits(credits);
    }

    @Override
    public String getCode() {
        return code;
    }

    @Override
    public void setCode(String code) {
        if (code == null || code.isEmpty()) {
            throw new IllegalArgumentException("Error: Null/Empty Course Code.");
        }
        this.code = code;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Error: Null/Empty Course Name.");
        }
        this.name = name;
    }

    @Override
    public int getCredits() {
        return credits;
    }

    @Override
    public void setCredits(int credits) {
        if (credits <= 0) {
            throw new IllegalArgumentException("Error: Course Credits ≤ 0.");
        }
        this.credits = credits;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Course)) throw new ClassCastException("Error: Invalid Course Object.");
        Course other = (Course) obj;
        return this.code.equals(other.code)
                && this.name.equals(other.name)
                && this.credits == other.credits;
    }

    @Override
    public String toString() {
        return "Course [Code: " + code + ", Name: " + name + ", Credits: " + credits + "]";
    }

    @Override
    public int hashCode() {
        int result = code.hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + credits;
        return result;
    }
}