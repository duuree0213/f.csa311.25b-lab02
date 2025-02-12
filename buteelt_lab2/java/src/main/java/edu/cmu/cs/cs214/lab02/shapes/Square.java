package edu.cmu.cs.cs214.lab02.shapes;

public class Square implements Shape {
    private double sideLen; // Encapsulation applied (changed to private)

    public Square(double sideLen) {
        this.sideLen = sideLen;
    }
    
    public double getArea() {
        return sideLen * sideLen;
    }
    
    @Override
    public void draw() {
        System.out.println("square iin neg taliin urt " + sideLen);
    }
}
