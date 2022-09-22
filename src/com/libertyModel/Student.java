package com.libertyModel;

import java.util.Date;

//This class will be used to keep track of students Data
public class Student extends Person implements StudentInterface {

 private String courses;
    public Student(String firstName, String lastName, String middleName, String contactAddress, String phoneContact, String emailAddress, byte age, Courses courses) {
        super(firstName, lastName, middleName, contactAddress, phoneContact, emailAddress, age);
        this.courses= String.valueOf(courses.values());
    }

    @Override
    public void applyForRemarking() {
        System.out.println("Remark");

    }

    @Override
    public void applyForChangeOfDepartment() {

    }

    @Override
    public void applyForChangeCourses() {

    }

    @Override
    public void applyForIdCard() {

    }
//    public String toString(){
//        return getFirstName() + " " + getLastName() + " " + getMiddleName();
//    }
}
