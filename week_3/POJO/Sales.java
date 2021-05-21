package com.company;
import java.util.Date;
public class Sales {
    private long ID;
    private Clients FirstName;
    private Clients LastName;
    private Kulikovsky Name;
    private Date DateOfSale;

    public Sales(){

    }
    public Sales(long ID, Clients FirstName, Clients LastName, Kulikovsky Name,Date DateOfSale){
        this.ID=ID;
        this.LastName=LastName;
        this.FirstName=FirstName;
        this.Name=Name;
        this.DateOfSale=DateOfSale;
    }

    public long getID(){
        return ID;
    }
    public void setID(long ID){
        this.ID=ID;
    }
    public Clients getLastName() {
        return LastName;
    }
    public void setLastName(Clients LastName){
        this.LastName=LastName;
    }
    public Clients getFirstName() {
        return FirstName;
    }
    public void setFirstName(Clients FirstName){
        this.FirstName=FirstName;
    }
    public Kulikovsky getName() {
        return Name;
    }
    public void setName(Kulikovsky Name){
        this.Name=Name;
    }
    public Date getDateOfSale(){
        return DateOfSale;
    }
    public void setDateOfSale(Date DateOfSale){
        this.DateOfSale=DateOfSale;
    }
}
