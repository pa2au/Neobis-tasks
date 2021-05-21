import java.util.Date;

public class Kulikovsky {
    private long ID;
    private String Name;
    private String Type;
    private String Shape;
    private double Price;
    private Date DateOfManufacture;
    private Date DateOfExpiration;

    //empty constructor
    public Kulikovsky() {

    }

    //parametric constructor
    public Kulikovsky(long ID, String Name, String Type, String Shape, double Price, Date DateOfManufacture, Date DateOfExpiration) {
        this.ID=ID;
        this.Name=Name;
        this.Type=Type;
        this.Shape=Shape;
        this.Price=Price;
        this.DateOfManufacture=DateOfManufacture;
        this.DateOfExpiration=DateOfExpiration;
    }
    //get&set

    public long getID() {
        return ID;
    }
    public void setID(long ID){
        this.ID=ID;
    }
    public String getName() {
        return Name;
    }
    public void setName(String Name){
        this.Name=Name;
    }
    public String getType() {
        return Type;
    }
    public void setType(String Type){
        this.Type=Type;
    }
    public String getShape() {
        return Shape;
    }
    public void setShape(String Shape){
        this.Shape=Shape;
    }
    public double getPrice() {
        return Price;
    }
    public void setPrice(double Price){
        this.Price=Price;
    }
    public Date getDateOfManufacture() {
        return DateOfManufacture;
    }
    public void setDateOfManufacture(Date DateOfManufacture){
        this.DateOfManufacture=DateOfManufacture;
    }
    public Date getDateOfExpiration() {
        return DateOfExpiration;
    }
    public void setDateOfExpiration(Date DateOfExpiration){
        this.DateOfExpiration=DateOfExpiration;
    }

  }
