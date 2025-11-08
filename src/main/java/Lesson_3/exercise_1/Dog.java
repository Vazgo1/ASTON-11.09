package Lesson_3.exercise_1;

public class Dog extends Animals {
    private  static  int dogCount = 0;


    public Dog(String nickname) {
        super(nickname);

    }
@Override
    public void run(int sprint) {
        if (sprint > 500) {
            System.out.println(nickname +" не может пробежать больше 500м");
        } else {
            System.out.println(nickname + " Пробежал " + sprint + " Метров");
        }
    }
@Override
    public void swam(int distance) {
        if (distance > 10) {
            System.out.println(nickname +" не может проплыть больше 10м");
        } else {
            System.out.println(nickname + " Проплыл " + distance + " Метров");

        }

    }
    public static int getDogCount(){
        return  dogCount;
    }
}
