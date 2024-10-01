package hw1;

public class Car implements Driveable {
    private String brand;
    private String model;
    private int year;

    public Car (String brand, String model, int year){
        this.brand=brand;
        this.model=model;
        this.year=year;
    }

    public void setBrand(String brand){
        this.brand=brand;
    }

    public void setModel(String model){
        this.model=model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    @Override
    public void start() {
        System.out.println(brand + " " + model + " " + year + " год " + " начинает движение");
    }

    @Override
    public void stop() {
        System.out.println(brand + " " + model + " " + year + " год " + " прекращает движение");
    }

    @Override
    public void drive(int distance) {
        System.out.println(brand + " " + model + " проехал " + distance + " километров.");
    }
}
