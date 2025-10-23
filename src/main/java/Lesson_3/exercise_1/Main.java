package Lesson_3.exercise_1;

public class Main {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Снежек");
        Cat cat2 = new Cat("Куки");
        Cat cat3 = new Cat("Пушек");
        Dog dog1 = new Dog("Балу");
        cat1.run(151);
        cat1.swam(10);
        cat2.run(151);
        cat2.swam(10);
        cat3.run(151);
        cat3.swam(10);
        dog1.run(300);
        dog1.swam(11);

        Cat[] cats = {cat1,cat2,cat3};
        for (int i = 0; i < cats.length; i++) {
            Bowl bowl = new Bowl(10);
            cats[i].eat(bowl, 15);
            bowl.info();
            bowl.addFood(30);

        }






    }


}