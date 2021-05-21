package com.company;
import java.util.Date;

public class Clients {
    private long ID;
    private String FirstName;
    private String LastName;
    private String Sex;
    private String PhoneNumber;
    private Date DateOfBirth;
    private Date DateOfRegistration;
    private String Address;

    public Clients(){

    }

    public Clients(long ID, String FirstName, String LastName, String Sex, String PhoneNumber,
                   Date DateOfBirth, Date DateOfRegistration, String Address){
        this.ID=ID;
        this.LastName=LastName;
        this.FirstName=FirstName;
        this.Sex=Sex;
        this.PhoneNumber=PhoneNumber;
        this.DateOfBirth=DateOfBirth;
        this.DateOfRegistration=DateOfRegistration;
        this.Address=Address;
    }

    public long getID(){
        return ID;
    }
    public void setID(long ID){
        this.ID=ID;
    }
    public String getLastName() {
        return LastName;
    }
    public void setLastName(String LastName){
        this.LastName=LastName;
    }
    public String getFirstName() {
        return FirstName;
    }
    public void setFirstName(String FirstName){
        this.FirstName=FirstName;
    }
    public String getSex() {
        return Sex;
    }
    public void setSex(String Sex){
        this.Sex=Sex;
    }
    public String getPhoneNumber() {
        return PhoneNumber;
    }
    public void setPhoneNumber(String PhoneNumber){
        this.PhoneNumber=PhoneNumber;
    }
    public Date getDateOfBirth() {
        return DateOfBirth;
    }
    public void setDateOfBirth(Date DateOfBirth){
        this.DateOfBirth=DateOfBirth;
    }
    public Date getDateOfRegistration() {
        return DateOfRegistration;
    }
    public void setDateOfRegistration(Date DateOfRegistration){
        this.DateOfRegistration=DateOfRegistration;
    }
    public String getAddress(){
        return Address;
    }
    public void setAddress(String Address){
        this.Address=Address;
    }
}
