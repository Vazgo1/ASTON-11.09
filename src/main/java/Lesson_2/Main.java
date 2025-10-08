package Lesson_2;

public class Main {
    public static void main(String[] args) {
        Parc.Attraction attraction1 = new Parc().new Attraction("Карусель", "18:00",300);
        attraction1.runs();
        array();
    }

    public static void array() {
        Product[] productsArray = new Product[5];
        productsArray[0] = new Product("Phone", 2025, "Apple", "USA", 100000, "Yes");
        productsArray[1] = new Product("Phone", 2024, "Apple", "USA", 900000, "No");
        productsArray[2] = new Product("Phone", 2023, "Apple", "USA", 800000, "No");
        productsArray[3] = new Product("Phone", 2022, "Apple", "USA", 700000, "Yes");
        productsArray[4] = new Product("Phone", 2021, "Apple", "USA", 600000, "Yes");
        for (int i = 0; i < productsArray.length; i++) {
            productsArray[i].run();
        }
    }

}
