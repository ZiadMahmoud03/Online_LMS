package com.example.online_lms.classes;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {


    private String name;
    private int id;
    private double gpa;
    private final List<Courses> coursesRegistered;
    private final List<Assesment> assessmentsTaken;
    private final List<StudyMaterial> studyingMaterials;
    private final List<String> toDoList;


    public Student(String firstName, String lastName, String phoneNumber, String email, String gender, String address, String dob, String department, Long nationalId, List<String> courses) {
        super(firstName, lastName, phoneNumber, email, gender, address, dob, department, nationalId, courses);
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
        this.gpa = 0.0;
        this.coursesRegistered = new ArrayList<>();
        this.assessmentsTaken = new ArrayList<>();
        this.studyingMaterials = new ArrayList<>();
        this.toDoList = new ArrayList<>();

    }

    public void takeAssessment(Assesment assessment) {
        assessmentsTaken.add(assessment);
    }

    public void registerCourse(Courses course) {
        coursesRegistered.add(course);
    }

    public void dropCourse(Courses course) {
        coursesRegistered.remove(course);
    }

    public String viewStudentInfo() {
        return "Name: " + FirstName + LastName + ", ID: " + id + ", GPA: " + gpa;
    }

    public void addToDoList(String item) {
        toDoList.add(item);
    }

    public List<String> displayToDoList() {
        return toDoList;
    }

    // Getters and Setters for GPA, if needed

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
