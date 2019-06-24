package studentsapplication;

public class Person {
    private String name;
    private String surname;
    private String mobile;

    public Person(String name, String surname, String mobile) {
        this.name = name;
        this.surname = surname;
        this.mobile = mobile;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", surname=" + surname + ", mobile=" + mobile + '}';
    }
    
    
}
