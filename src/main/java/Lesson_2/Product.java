package Lesson_2;

public class Product {
    private String name;
    private String date;
    private String country;
    private String condition;
    private int price;
    private String level;

    public Product(String name, String date, String country, String condition, int price, String level) {

        this.name = name;
        this.date = date;
        this.country = country;
        this.condition = condition;
        this.price = price;
        this.level = level;
    }

    public void run() {
        System.out.println("Название - " + name);
        System.out.println("Дата производства - " + date);
        System.out.println("Производитель - " + country);
        System.out.println("Страна происхождения - " + condition);
        System.out.println("Состояние бронирования покупателем - " + level);
        System.out.println();
    }
}