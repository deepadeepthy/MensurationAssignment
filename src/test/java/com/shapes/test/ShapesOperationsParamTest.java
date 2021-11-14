package com.shapes.test;

import com.shapes.ShapesOperations;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShapesOperationsParamTest {




    @ParameterizedTest
    @MethodSource("valuesToTestAreaOfRectangle")
    void testRectangleArea(double length,double breadth,double expectedArea){

        ShapesOperations rectangle = new ShapesOperations(length, breadth);
        assertEquals(expectedArea,rectangle.getRectanglesArea());

    }

    private static Stream<Arguments> valuesToTestAreaOfRectangle() {
        return Stream.of(
                Arguments.of(10,20,200),
                Arguments.of(0,20,0),
                Arguments.of(-10,20,-10)
        );
    }

    @ParameterizedTest
    @MethodSource("valuesToTestPerimeterOfRectangle")
    void testRectanglePerimeter (double length, double breadth, double expectedPerimeter){
        ShapesOperations rectangle=new ShapesOperations(length, breadth);
        assertEquals(expectedPerimeter,rectangle.getRectanglesPerimeter());

    }

    private static Stream<Arguments> valuesToTestPerimeterOfRectangle() {
        return Stream.of(
                Arguments.of(10,20,60),
                Arguments.of(-12,8,-12)
        );
    }


}
