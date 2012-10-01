package org.karpukhin.lab1.step4withmodel;

/**
 * @author Pavel Karpukhin
 */
public class Student {

    private String firstName;
    private String lastName;
    private String group;
    private String birthDate;

    public Student() {
    }

    public Student(String firstName, String lastName, String group, String birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.birthDate = birthDate;
    }

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

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }
}
