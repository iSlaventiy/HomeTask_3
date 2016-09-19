package BackToSchool;

/**1. Add methods to "set" and "get" the instance variables in the Person class.
 *  These would consist of: getName, setName, etc.
 * 19.09.16.
 */
public class Person {
    private String name;
    private int age;
    //String gender;
    private boolean gender;//

    public Person(String name, int age, boolean gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /*public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    */
    public String isGender() {
        return gender ? "M" : "F"; //
    }

    public String toString() {
        return getName() + ", " + getAge() + ", " + "gender: " + isGender();
    }

}
