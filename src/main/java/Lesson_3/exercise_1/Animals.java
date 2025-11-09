package Lesson_3.exercise_1;


public class  Animals {
 String nickname;
 public static int animalCount = 0;


public  Animals (String nickname){
    this.nickname = nickname;


}
    public void run(int sprint) {

    System.out.println(nickname + " Пробежал " + sprint + " Метров");
    }


    public void swam(int distance) {
        System.out.println(nickname + " Проплыл " + distance + " Метров");
        }

        public static int getAnimal(){

    return animalCount;
        }
    }





