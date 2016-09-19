import BackToSchool.CollegeStudent;
import BackToSchool.Person;
import BackToSchool.Student;
import BackToSchool.Teacher;

import java.util.ArrayList;

/**
 * 19.09.16.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();
        persons.add (new Person("Vasya", 34, false));
        persons.add(new Person("Kolya", 23, false));
        persons.add(new Teacher("Mihalysh", 48, true, 50, "CE,ENG"));
        persons.add(new Teacher("Kolyanuch", 90, false,5000, "OTH"));
        persons.add(new Student("Leshuy", 17, false, "5678", 1.5));
        persons.add(new Student("Julka", 23, false, "98765", 5.5));
        persons.add(new CollegeStudent("Sizuy", 40, true, "12345", 11.0, 7, "2"));
        persons.add(new CollegeStudent("Andreyko", 19, true, "98765", 1.0, 12, "3"));

        for (Person person : persons)
            System.out.println(person.toString());


    }
}
