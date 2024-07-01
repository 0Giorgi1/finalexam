package finalexam.task1;

public class Circle implements Drawable {
    private double radius;
    private String color;

    public Circle(double radius, String color) {
        if (radius < 0) {
            throw new IllegalArgumentException("Radius cannot be negative");
        }
        this.radius = radius;
        this.color = color;
    }

    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a " + color + " circle with radius " + radius);
    }
}