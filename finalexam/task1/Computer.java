package finalexam.task1;

public class Computer implements Drawable {
    private String brand;
    private String model;

    public Computer(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a computer of brand " + brand + " and model " + model);
    }
}