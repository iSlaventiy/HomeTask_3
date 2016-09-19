package BackToSchool;

/**2. Add methods to "set" and "get" the instance variables in the Student class.
 * 19.09.16.
 */
public class Student extends Person {
    private String idNumber;
    private Double gpa;

    public Student(String name, int age, boolean gender, String idNumber, Double gpa) {
        super(name, age, gender);
        this.idNumber = idNumber;
        this.gpa = gpa;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public Double getGpa() {
        return gpa;
    }

    public void setGpa(Double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return super.toString() + ", student Id: " + getIdNumber() + ", gpa: " + getGpa();

    }
}
