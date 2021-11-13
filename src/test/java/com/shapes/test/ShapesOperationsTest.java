package com.shapes.test;

import com.shapes.ShapesOperations;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ShapesOperationsTest {

    @Test
    void testForAreaOfRectangle(){
        ShapesOperations rectangle=new ShapesOperations(10,15);
        assertEquals(150,rectangle.getRectanglesArea());
    }

    @Test
    void testForPerimeterOfRectangle(){
        ShapesOperations rectangle=new ShapesOperations(10,15);
        assertEquals(50,rectangle.getRectanglesPerimeter());
    }
}
