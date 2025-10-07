import java.util.Arrays;

public class Lesson1 {

    public static void main(String[] args) {

        printThreeWords();
//        checkSumSign();
//        printColor();
//        compareNumbers();
//        positiveNumber(-10);
//        System.out.println(sum(7, 8));
//        System.out.println(integer(-1));
//        intStr("hello", 3);
//        System.out.println(year(801));
//        arrayIntegers();
//        arrayLength();
//        arrayInt();
//        doubleArray();

        System.out.println( Arrays.toString(lenArray(4,5)));


    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 5;
        int b = 8;
        int c = a + b;
        if (c >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = 10;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value < 100) {
            System.out.println("Желтый");
        } else if (value > 100) {
            System.out.println("зеленый");
        }

    }

    public static void compareNumbers() {
        int a = 8;
        int b = 7;

        if (a >= b) {
            System.out.println("a>=b");
        } else {
            System.out.println("a < b");
        }
    }

    public static boolean sum(int a, int b) {
        int c = a + b;
        return c >= 10 && c <= 20;

    }


    public static void positiveNumber(int a) {
        if (a >= 0) {
            System.out.println("число положительное");
        } else {
            System.out.println("число отрицательное");
        }
    }

    public static boolean integer(int a) {

        return a >= 0;

    }

    public static void intStr(String a, int b) {
        for (int i = 0; i < b; i++) {
            System.out.println(a);

        }
    }

    public static boolean year(int a) {
        return (a % 4 == 0 && a % 100 != 0) || (a % 400 == 0);

    }

    public static void arrayIntegers() {
        int[] a = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                a[i] = 1;

            } else if (a[i] == 1) {
                a[i] = 0;
            }
            System.out.print(a[i] + " ");


        }
        System.out.println();
    }

    public static void arrayLength() {
        int[] a = new int[100];
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                a[i] = i + 1;

                System.out.print(a[i] + " ");
            }

        }
        System.out.println();
    }

    public static void arrayInt() {
        int[] a = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 6) {
                a[i] = a[i] * 2;


            }

            System.out.print(a[i] + " ");


        }
        System.out.println();

    }

    public static void doubleArray() {
        int b = 5;
        int[][] a = new int[b][b];
        for (int i = 0; i < b; i++) {
            a[i][i] = 1;
        }
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(a[i][j]);

            }
            System.out.println();

        }

    }
    public static int[] lenArray(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;

        }
        return array;

    }




}








