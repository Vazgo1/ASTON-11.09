package Lesson_4;

public class Array {

    public static int array(String[][] arr) throws MyArraySizeException, MyArrayDataException {


        if (arr.length != 4) {
            throw new MyArraySizeException("массив дожен быть размером 4  фактический размер -  " + arr.length);
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) {
                throw new MyArraySizeException("В место 4-х элементов строка содержит " + arr[i].length);
            }

        }
        System.out.println("Массив 4х4 успешно прошел проверку");

            int a = 0;

            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {

                    try {
                        a += Integer.parseInt(arr[i][j]);
                } catch (ArrayIndexOutOfBoundsException e) {
                        throw new MyArrayDataException(i,j,arr[i][j]);
                    }
                    }
                System.out.println(" Сумма элементов массива = " + a );
        }

            return a;
    }

}