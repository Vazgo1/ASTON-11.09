package Lwsson_5.exercise_1;

import java.util.ArrayList;

public class Student {
    String name;
    int group;
    int well;
    double grades;

    @Override
    public String toString() {
        return
                "Имя = " + name  +
                " Группа = " + group +
                " Курс = " + well +
                " Средний бал = " + grades
                ;
    }

    public Student(String name, int group, int well, double grades) {
        this.name = name;
        this.group = group;
        this.well = well;
        this.grades = grades;
    }

    public  double getGrades(){

        return grades;
    }


    public void add(){
        this.well++;
    }
    public int getWell(){
        return well;
    }






    }

