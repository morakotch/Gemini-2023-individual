
public class Vehicle {
    private int serialNo;
    private String name;
    private String model;
    private int year;
    private String manufacturer;
    private double baseCost;

    public Vehicle() {
    }

    public Vehicle( int serialNo, String name, String model, int year, String manufacturer, double baseCost) {
        this.serialNo = serialNo;
        this.name = name;
        this.model = model;
        this.year = year;
        this.manufacturer = manufacturer;
        this.baseCost = baseCost;
    }

    public void setSerialNo(int serialNo) {
        this.serialNo = serialNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setBaseCost(double baseCost) {
        this.baseCost = baseCost;
    }

    public String toString() {
        return this.name + " " + this.model + " " + this.year + " "
                + this.baseCost + " " + this.serialNo;
    }
}