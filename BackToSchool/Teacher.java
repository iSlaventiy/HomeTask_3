package BackToSchool;

/**Teacher class that extends the parent class Person.
 * 19.09.16.
 */
public class Teacher extends Person {
    private double salary;
    private String subject;

    public Teacher(String name, int age, boolean gender, double salary, String subject) {
        super(name, age, gender);
        this.salary = salary;
        this.subject = subject;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getSubject() {
        StringBuilder builder = new StringBuilder();// вариант перподавания нескольких предметов/ куку ёпта
        String SC = "Computer Sience";
        String CE = "Chemistry";
        String ENG = "English";
        String OTH = "Other";
        if (subject.contains("SC"))
            builder.append (SC + ", ");
        if (subject.contains("CE"))
            builder.append (CE + ", ");
        if (subject.contains("ENG"))
            builder.append (ENG + ", ");
        if (subject.contains("OTH"))
            builder.append (OTH + ", ");
        subject = builder.toString();

        return subject;
    }

    public void setSubject(String subject) {
       this.subject = subject;
    }


    @Override
    public String toString() {
        return super.toString() + ", " + "subject: " + getSubject() + " " + "salary: " + getSalary() + " $";
}
}
