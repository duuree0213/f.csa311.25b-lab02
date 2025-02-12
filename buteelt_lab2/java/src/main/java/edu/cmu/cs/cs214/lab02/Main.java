package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.Rectangle;
import edu.cmu.cs.cs214.lab02.shapes.Shape;
import edu.cmu.cs.cs214.lab02.shapes.Circle;
import edu.cmu.cs.cs214.lab02.shapes.Square;

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(10, 20);
        Shape circle = new Circle(15);
        Shape square = new Square(5.0); 
      
   
        
        Renderer renderer = new Renderer();
        renderer.render(square); 
        renderer.render(rectangle);
        renderer.render(circle);
    }
}

