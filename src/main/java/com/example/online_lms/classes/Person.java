package com.example.online_lms.classes;

import java.util.ArrayList;
import java.util.List;

public class Person {

    String FirstName;
    String LastName;
    String PhoneNumber;
    String email;
    String gender;

    String address;
    String dob;
    String department;

    Long NationalId;

    List<String> Courses;

    public Person(String firstName, String lastName, String phoneNumber, String email, String gender, String address, String dob, String department, Long nationalId, List<String> courses) {
        this.FirstName = firstName;
        this.LastName = lastName;
        this.PhoneNumber = phoneNumber;
        this.email = email;
        this.gender = gender;
        this.address = address;
        this.dob = dob;
        this.department = department;
        this.NationalId = nationalId;
        this.Courses = courses;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Long getNationalId() {
        return NationalId;
    }

    public void setNationalId(Long nationalId) {
        NationalId = nationalId;
    }

    public List<String> getCourses() {
        return Courses;
    }

    public void setCourses(List<String> courses) {
        Courses = courses;
    }


}
