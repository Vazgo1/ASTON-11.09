package Lesson_3.exercise_2;


public class Triangle implements Shapes{
    private double width;
    private double heightLeft;
    private  double heightRight;
    private String fillColor;
    private String borderColor;
    private String name;

    Triangle(String name,double width, double heightLeft, double heightRight, String fillColor, String borderColor){
        this.name = name;
        this.width = width;
        this.heightLeft = heightLeft;
        this.heightRight = heightRight;
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
        return width + heightLeft +heightRight;
    }

    @Override
    public double getArea() {
        return width + heightRight + heightLeft / 2;
    }

    @Override
    public String gatName() {
        return name;
    }
}
