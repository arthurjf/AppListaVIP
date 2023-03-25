package br.com.arthurjf.cursoandroid.applistavip.model;

public class Person {
    private String firstName;
    private String lastName;
    private String courseName;
    private String phoneNumber;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Person(){

    }

    public Person(String firstName, String lastName, String courseName, String phoneNumber){
        setFirstName(firstName);
        setLastName(lastName);
        setCourseName(courseName);
        setPhoneNumber(phoneNumber);
    }
}
