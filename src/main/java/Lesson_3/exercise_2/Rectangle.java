package Lesson_3.exercise_2;


public class Rectangle implements Shapes {
    private double width;
    private double height;
    private String fillColor;
    private String borderColor;
    private String name;

    Rectangle(String name,double width, double height, String fillColor, String borderColor){
       this.name = name;
        this.width = width;
        this.height = height;
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
        return 2 *(width + height);
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public String gatName() {
        return name;
    }
}
