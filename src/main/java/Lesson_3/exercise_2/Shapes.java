package Lesson_3.exercise_2;

public interface Shapes {
    String  getFillColor();

     String getBorderColor();

     double getPerimeter();

     double getArea();

     String gatName();

     default void info(){
         System.out.println(gatName());
         System.out.println("Площадь " + getArea());
         System.out.println("Периметр " + getPerimeter());
         System.out.println("Цвет заливки " + getFillColor());
         System.out.println("Цвет границ " + getBorderColor());
         System.out.println();
     }


}


