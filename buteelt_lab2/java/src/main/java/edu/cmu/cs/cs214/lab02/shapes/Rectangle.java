package edu.cmu.cs.cs214.lab02.shapes;



public class Rectangle implements Shape {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("tegsh untsugtin urgun " + width + " undur " + height);
        System.out.println(width * height);
    }
}

