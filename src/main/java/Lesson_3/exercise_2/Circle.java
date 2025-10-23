package Lesson_3.exercise_2;


public class Circle implements Shapes{
    private double radius;
    private String fillColor;
    private String borderColor;
    private String name;

    public Circle(String name,double radius,String fillColor,String borderColor){
        this.name = name;
        this.radius = radius;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public String getFillColor() {
        return fillColor;
    }

    @Override
    public String getBorderColor() {
        return borderColor;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String gatName() {
        return name;
    }
}
