package com.libertyModel;

import java.util.Date;

//This class will be used to keep track of students Data
public class STUDENTS extends PERSON implements STUDENT_INTERFACE{


    public STUDENTS(String firstName, String lastName, String middleName, String contactAddress, int phoneContact, String emailAdress, Date birthday) {
        super(firstName, lastName, middleName, contactAddress, phoneContact, emailAdress, birthday);
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
}
