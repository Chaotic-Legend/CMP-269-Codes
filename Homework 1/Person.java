// CMP 269: Programming Methods III - Homework 1 - Isaac D. Hoyos

import java.util.Objects;

// Person Class implementing PersonInterface.
public class Person implements PersonInterface {
    private String name;
    private int age;
    private String ssn;
    private static final String DEFAULT_NAME = "UN";
    private static final int DEFAULT_AGE = 0;
    private static final String DEFAULT_SSN = "000-00-0000";
    private static final String SSN_REGEX = "\\d{3}-\\d{2}-\\d{4}";

    public Person() {
        this.name = DEFAULT_NAME;
        this.age = DEFAULT_AGE;
        this.ssn = DEFAULT_SSN;
    }

    public Person(String name, int age, String ssn) {
        this.name = (name == null) ? DEFAULT_NAME : name;
        this.age = (age < 0) ? DEFAULT_AGE : age;
        this.ssn = (ssn == null) ? DEFAULT_SSN : ssn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = (name == null) ? DEFAULT_NAME : name;
    }

    @Override
    public PersonInterface copy() {
        return new Person(this.name, this.age, this.ssn);
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Error: Negative Age.");
        }
        this.age = age;
    }

    @Override
    public String getSsn() {
        return ssn;
    }

    @Override
    public void setSsn(String ssn) {
        if (ssn == null || !ssn.matches(SSN_REGEX)) {
            throw new IllegalArgumentException("Error: Invalid SSN Format. Expected XXX-XX-XXXX.");
        }
        this.ssn = ssn;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Person)) return false;
        Person other = (Person) obj;
        return this.age == other.age
                && Objects.equals(this.name, other.name)
                && Objects.equals(this.ssn, other.ssn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, ssn);
    }

    @Override
    public String toString() {
        return "Person [Name: " + name + ", Age: " + age + ", SSN: " + ssn + "]";
    }
}