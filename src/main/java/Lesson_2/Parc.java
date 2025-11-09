package Lesson_2;

public class Parc {


    public class Attraction {
        private String attraction;
        private String openingHours;
        private int price;

        public Attraction (String attraction, String openingHours, int price) {
            this.attraction = attraction;
            this.openingHours = openingHours;
            this.price = price;
        }


        public void runs() {
            System.out.println("Атракцион - " + attraction);
            System.out.println("Время работы - " + openingHours);
            System.out.println("Цена - " + price);
        }
    }
}