package Lesson_3.exercise_1;

public class Cat extends Animals {
    private  static  int catCount = 0;
    private boolean full;

    public Cat(String nickname) {
        super(nickname);
        catCount++;
        this.full = false;
    }

    @Override
    public void run(int sprint) {
        if (sprint > 150) {
            System.out.println(nickname + " не может пробежать более 150м");
        } else {
            System.out.println(nickname + " Пробежал " + sprint + " Метров");
        }
    }

    @Override
    public void swam(int distance) {
        if (distance > 0) {
            System.out.println(nickname + " не умеет плавать");
        }

    }

   public void eat (Bowl bowl,int amount) {
        if (bowl.decreaseFood(amount)) {


            System.out.println(nickname + " Покушал. Теперь сыт");

        }else {
            System.out.println("Недостаточно еды в миске");
        }

            }
            public static int getCatCount(){
        return catCount;
            }

        }



