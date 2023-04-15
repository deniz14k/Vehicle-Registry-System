package isp.lab6.exercise2;
import java.util.HashSet;


public class CarInfo {


    HashSet<CarInfo> registry=new HashSet<CarInfo>();
    private int vin;
    private String licensePlate;
    private String make;
    private String model;
    private int year;

    public CarInfo(int vin, String licensePlate, String make, String model, int year) {
        this.vin = vin;
        this.licensePlate = licensePlate;
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public int getVin() {
        return vin;
    }

    public void setVin(int vin) {
        this.vin = vin;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String toString(){return this.make + "  " + this.model + "  "  + this.year + "  " + this.licensePlate + "  "  + this.vin;}



}

