package com.libertyModel;

public class Principal extends Staffs implements PrincipalInterface {

    public Principal(String firstName, String lastName, String middleName, String contactAddress, String phoneContact, String emailAddress, byte age) {
        super(firstName, lastName, middleName, contactAddress, phoneContact, emailAddress, age);
    }



    @Override
    public void expelStudent() {
        System.out.println("You have been withdrawn due to examination malpractice");
    }

    @Override
    public void admitApplicant() {
        int age = 0;
        if (age <= 26) {
            System.out.println("Congratulations, you have been offer Provisional Admission");
        } else {
            System.out.println("Not Admitted");
        }
    }

    @Override
    public void suspendStudent() {
        System.out.println("You have been suspended for one week");
    }
}
