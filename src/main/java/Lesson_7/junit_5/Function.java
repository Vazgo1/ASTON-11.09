package Lesson_7.junit_5;

public class Function {

    public static boolean sum(int a, int b) {
        if (a > b) {
            return false;
        } else if (a < b) {
            return false;
        } else {
            return true;
        }
    }

    public static double getTriangle(double width, double height) {
        return width * height / 2;
    }

    public static int calculator(int a, int b, char operator) {
        switch (operator) {
            case '+':
                return a + b;
                case '-':
                return a - b;
                case '*':
                return a * b;
                case '/':
                return a / b;
        }
        return 0;
    }

    public static long factorial(int a) {
        if (a < 0) {
        }
            long result = 1;
            for (int i = 2; i <= a; i++) {
                result *= i;
            }
            return result;
    }
}


