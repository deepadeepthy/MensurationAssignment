package com.shapes;

public class ShapesOperations {
    private double breadth;
    private double length;

    public ShapesOperations(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double getRectanglesArea() {
        return length * breadth;
    }

    public double getRectanglesPerimeter() {
        return 2 * ( length + breadth );
    }
}
