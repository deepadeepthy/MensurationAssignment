package com.shapes;

public class ShapesOperations {
    private double breadth;
    private double length;

    public ShapesOperations(double length) {
        this.length = length;
    }

    public ShapesOperations(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    boolean isInputZeroOrNegative(double inputValue){
        if(inputValue <= 0)
            return true;
        return false;
    }

    public double getRectanglesArea() {
        if(isInputZeroOrNegative(length))
            return length;
        if(isInputZeroOrNegative(breadth))
            return breadth;
        return length * breadth;
    }

    public double getRectanglesPerimeter() {
        if(isInputZeroOrNegative(length))
            return length;
        if(isInputZeroOrNegative(breadth))
            return breadth;
        return 2 * ( length + breadth );
    }

    public double getSquaresArea() {
        if(isInputZeroOrNegative(length))
            return length;
        return length * length;
    }

    public double getSquaresPerimeter() {
        if(isInputZeroOrNegative(length))
            return length;
        return 4 * length;
    }
}
