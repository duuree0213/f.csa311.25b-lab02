package edu.cmu.cs.cs214.lab02.shapes;

public class Circle implements Shape {
    private int radius;
    
    public Circle(int radius) {
        this.radius = radius;
    }
    
    @Override
    public void draw() {
        System.out.println("Toirgiin radius " + radius);
    }
}
