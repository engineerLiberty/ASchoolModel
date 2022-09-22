package com.libertyModel;

import java.util.Date;

public  class PERSON {
    private String firstName;
    private String lastName;
    private String middleName;
    private String contactAddress;
    private int  phoneContact;
    private  String emailAddress;
    private int birthday;

     public PERSON(String firstName, String lastName, String middleName, String contactAddress, int phoneContact, String emailAddress, int age
    ){
        this.lastName = lastName;
        this.firstName= firstName;
        this.middleName = middleName;
        this.contactAddress = contactAddress;
        this.phoneContact = phoneContact;
        this.emailAddress = emailAddress;
        this.birthday = PERSON.this.birthday;
     }

    public PERSON(String firstName, String lastName, String middleName, String contactAddress, int phoneContact, String emailAdress, Date birthday) {
    }

    //Setters
     public void setFirstName(){this.firstName= firstName;}
    public void setLastName(){this.firstName= lastName;}
    public void setMiddleName(){this.middleName= middleName;}
    public void setContactAddress(){this.contactAddress = contactAddress;}
    public void setPhoneContact(){this.phoneContact = phoneContact;}
    public void setBirthday(){this.birthday = birthday;}
    public void setEmailAddress(){this.firstName= emailAddress;}

    //Getters
    public void getFirstName(){this.firstName= firstName;}
    public void getMiddleName(){this.middleName= middleName;}
    public void getContactAddress(){this.contactAddress = contactAddress;}
    public void getPhoneContact(){this.phoneContact = phoneContact;}
    public void getBirthday(){this.birthday = birthday;}
    public void getEmailAddress(){this.firstName= emailAddress;}
    public void getLastName(){this.firstName= lastName;}

}
