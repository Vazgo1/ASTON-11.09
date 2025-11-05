package Lwsson_5.exercise_1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Student("Иван", 102, 1, 4.2));
        arrayList.add(new Student("Петр", 202, 2, 2.3));
        arrayList.add(new Student("Сергей", 302, 3, 2.1));
        arrayList.add(new Student("Киррил", 102, 1, 2.4));
        arrayList.add(new Student("Антон", 402, 4, 4.5));
        HashSet stud = new HashSet();
        stud.add(new Student("Иван", 102, 2, 4.2));
        stud.add(new Student("Наталья", 102, 1, 4.2));
        stud.add(new Student("Кристина", 102, 2, 4.2));
        System.out.println(" До удаления " + arrayList);
        System.out.println();
        removeStudents(arrayList);
        System.out.println(" После " + arrayList);
        transferToCourse(arrayList);
        System.out.println();
        System.out.println("После перевода ");
        System.out.println(arrayList);
        System.out.println();
        System.out.println("Список студентов");
        printStudents(stud, 2);
    }

    public static void removeStudents(ArrayList<Student> list) {
        Iterator<Student> iterator = list.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getGrades() < 3.0) {
                iterator.remove();
            }
        }
    }

    public static void transferToCourse(ArrayList<Student> list) {
        Iterator<Student> iterator = list.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getGrades() > 3.0) {
                student.add();
            }
        }
    }

    public static void printStudents(Set<Student> students, int well) {
        for (Student s : students) {
            if (s.getWell() == well)
                System.out.println(s);
        }
    }
}









