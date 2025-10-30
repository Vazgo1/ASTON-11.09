package Lesson_7.junit_5;

import Lesson_7.junit_5.Function;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FunctionTest {

    @Test
    void sumTest() {

        Assertions.assertTrue(Function.sum(5, 5));
        Assertions.assertTrue(Function.sum(-2, -2));
        Assertions.assertTrue(Function.sum(10, 10));
    }

    @Test
    void sumTestNegative() {

        Assertions.assertTrue(Function.sum(2, 5));
        Assertions.assertTrue(Function.sum(-2, -1));
        Assertions.assertTrue(Function.sum(10, 8));
    }

    @Test
    void getTriangleTest() {

        Assertions.assertEquals(25.0, Function.getTriangle(5, 10));
        Assertions.assertEquals(0.0, Function.getTriangle(5, 0));
        Assertions.assertEquals(0.0, Function.getTriangle(0, 10));
        Assertions.assertEquals(50.0, Function.getTriangle(10, 10));
    }

    @Test
    void getTriangleTestNegative() {
        Assertions.assertEquals(25.0, Function.getTriangle(5, 8));
        Assertions.assertEquals(0.0, Function.getTriangle(5, 4));
        Assertions.assertEquals(0.0, Function.getTriangle(8, 10));
        Assertions.assertEquals(50.0, Function.getTriangle(4, 10));
    }

    @Test
    void calculatorTest() {
        Assertions.assertEquals(10, Function.calculator(5, 5, '+'));
        Assertions.assertEquals(5, Function.calculator(10, 5, '-'));
        Assertions.assertEquals(25, Function.calculator(5, 5, '*'));
        Assertions.assertEquals(5, Function.calculator(10, 2, '/'));
    }

    @Test
    void calculatorTestNegative() {
        Assertions.assertEquals(10, Function.calculator(5, 1, '+'));
        Assertions.assertEquals(5, Function.calculator(10, 3, '-'));
        Assertions.assertEquals(25, Function.calculator(5, 2, '*'));
        Assertions.assertEquals(5, Function.calculator(10, 3, '/'));
    }

    @Test
    void factorialTest() {
        Assertions.assertEquals(1, Function.factorial(0));
        Assertions.assertEquals(2, Function.factorial(2));
        Assertions.assertEquals(6, Function.factorial(3));
        Assertions.assertEquals(120, Function.factorial(5));
    }

    @Test
    void factorialTestNegative() {
        Assertions.assertEquals(3, Function.factorial(0));
        Assertions.assertEquals(4, Function.factorial(2));
        Assertions.assertEquals(7, Function.factorial(3));
        Assertions.assertEquals(120, Function.factorial(8));
    }
}
