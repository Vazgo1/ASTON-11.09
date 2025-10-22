package Lesson_3.exercise_2;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle("Круг ",20,"Красный","Синий");
        Rectangle rectangle =  new Rectangle("Прямоугольник ",5,8,"Красный","Синий");
        Triangle triangle = new Triangle("Треугольник",6,9,9,"Красный","Синий");

        circle.info();
        rectangle.info();
        triangle.info();
    }
}
