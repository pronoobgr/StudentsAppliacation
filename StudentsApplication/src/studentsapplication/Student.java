/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentsapplication;

/**
 *
 * @author 
 */
public class Student extends Person {
    private String am;
    private String uni;
    private String inYear;

    public Student(String am, String uni,String inYear, String name, String surname, String mobile) {
        super(name, surname, mobile);
        this.am = am;
        this.uni = uni;
        this.inYear = inYear;
    }

    public Student(String am, String uni,String inYear) {
        this.am = am;
        this.uni = uni;
        this.inYear = inYear;
    }

    public Student() {
    }

    public String getAm() {
        return am;
    }

    public void setAm(String am) {
        this.am = am;
    }

    public String getUni() {
        return uni;
    }

    public void setUni(String uni) {
        this.uni = uni;
    }

    public String getInYear() {
        return inYear;
    }

    public void setInYear(String inYear) {
        this.inYear = inYear;
    }

    @Override
    public String toString() {
        return "Student{"+ ", name=" + this.getName() + ", surname=" + this.getSurname() + 
                ", mobile= " + this.getMobile() + ", am=" + am + ", uni=" + uni + ", inYear=" + inYear + '}';
    }

   
    
    
    
    
}
