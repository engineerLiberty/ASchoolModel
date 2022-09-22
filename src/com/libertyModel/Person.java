package com.libertyModel;

//import java.util.Date;

public  abstract class Person {
    private String firstName;
    private String lastName;
    private String middleName;
    private String contactAddress;
    private String  phoneContact;
    private  String emailAddress;
    private byte age;

     public Person(String firstName, String lastName, String middleName, String contactAddress, String phoneContact, String emailAddress, byte age)
    {
        this.lastName = lastName;
        this.firstName= firstName;
        this.middleName = middleName;
        this.contactAddress = contactAddress;
        this.phoneContact = phoneContact;
        this.emailAddress = emailAddress;
        this.age = age;
     }
     public Person(){
         this.lastName = "Imobi";
         this.firstName= "liberty";
         this.middleName = "";
         this.contactAddress = "";
         this.phoneContact = "0709989797";
         this.emailAddress = "libertyimobi@gmail.com";
         this.age = 29;
     }

    //Setters
     public void setFirstName(String firstName){this.firstName= firstName;}
    public void setLastName(String lastName){this.firstName= lastName;}
    public void setMiddleName(String middleName){this.middleName= middleName;}
    public void setContactAddress(String contactAddress){this.contactAddress = contactAddress;}
    public void setPhoneContact(String phoneContact){this.phoneContact = phoneContact;}
    public void setAge(byte age){this.age = age;}
    public void setEmailAddress(String emailAddress){this.firstName= emailAddress;}

    //Getters
    public String getFirstName(){return firstName;}
    public String getMiddleName(){return middleName;}
    public  String getContactAddress(){return contactAddress;}
    public String getPhoneContact(){return  phoneContact;}
    public byte getAge(){return age;}
    public String getEmailAddress(){return emailAddress;}
    public String getLastName(){return lastName;}

}
