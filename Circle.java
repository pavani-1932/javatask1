package javaassignment3;

public class Circle {
    // Data member
    private double radius;

    // No-argument constructor (defaults radius to 1.0)
    public Circle() {
        this.radius = 1.0;
    }

    // Parameterized constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate circumference
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    // Getter for radius
    public double getRadius() {
        return radius;
    }

    // Setter for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Main method to test the class
    public static void main(String[] args) {
        Circle c1 = new Circle(); // Using no-arg constructor
        System.out.println("Circle 1 radius: " + c1.getRadius());
        System.out.println("Circle 1 circumference: " + c1.getCircumference());

        Circle c2 = new Circle(5.0); // Using parameterized constructor
        System.out.println("Circle 2 radius: " + c2.getRadius());
        System.out.println("Circle 2 circumference: " + c2.getCircumference());
    }
}

