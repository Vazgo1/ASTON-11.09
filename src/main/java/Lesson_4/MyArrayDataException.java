package Lesson_4;

public class MyArrayDataException extends Exception {
   public MyArrayDataException (int arr, int arr1, String value) {
      super(String.format("Не верные данные в ячейке  " , arr, arr1, value));
   }
   }

