package BackToSchool;

/**3 Write a CollegeStudent subclass that extends the Student class.
 * 19.09.16.
 */
public class CollegeStudent extends Student{
    private int year;
    private String major;

    @Override
    public String toString() {
        return super.toString() + " yeaar " + getYear() + " major " + getMajor();
    }

    public CollegeStudent(String name, int age, boolean gender, String idNumber, Double gpa, int year, String major) {
        super(name, age, gender, idNumber, gpa);
        this.year = year;
        this.major = major;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMajor() {
        switch (major){ //Выбор специальности
            case "1" : this.major = "Electrical Engineering";
                break;
            case "2" : this.major = "Communications";
                break;
            case "3" : this.major = "Undeclared";
                break;
        }
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }


}
