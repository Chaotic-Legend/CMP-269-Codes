// CMP 269: Programming Methods III - Homework 1 - Isaac D. Hoyos

// Instructor Class that extends Person and implements InstructorInterface.
public class Instructor extends Person implements InstructorInterface {
    private int emplid;
    private int yearOfHire;
    private static final int DEFAULT_EMPLID = -1;
    private static final int DEFAULT_YEAR_OF_HIRE = 2025;

    public Instructor() {
        super();
        this.emplid = DEFAULT_EMPLID;
        this.yearOfHire = DEFAULT_YEAR_OF_HIRE;
    }

    public Instructor(String name, int emplid, int age, String ssn, int yearOfHire) {
        super(name, age, ssn);
        this.emplid = emplid;
        this.yearOfHire = yearOfHire;
    }

    @Override
    public int getEmplid() {
        return emplid;
    }

    @Override
    public void setEmplid(int emplid) {
        this.emplid = emplid;
    }

    @Override
    public int getYearOfHire() {
        return yearOfHire;
    }

    @Override
    public void setYearOfHire(int yearOfHire) {
        this.yearOfHire = yearOfHire;
    }

    @Override
    public String toString() {
        return "Instructor [Name: " + getName() + 
               ", Age: " + getAge() + 
               ", SSN: " + getSsn() + 
               ", EMPLID: " + emplid + 
               ", Year of Hire: " + yearOfHire + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Instructor)) return false;
        if (!super.equals(obj)) return false;
        Instructor other = (Instructor) obj;
        return this.emplid == other.emplid &&
               this.yearOfHire == other.yearOfHire;
    }

    @Override
    public int hashCode() {
        return super.hashCode() * 31 + emplid + yearOfHire;
    }
}