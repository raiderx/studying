package org.karpukhin.lab2.ex1;

import java.util.Date;

/**
 * @author Pavel Karpukhin
 * @since 01.10.12
 */
public class Student {

    private int id = -1;
    private String firstName;
    private String lastName;
    private Date birthDate;
    private String email;

    public Student() {
    }

    public Student(String firstName, String lastName, Date birthDate, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
