package Lesson_2;

public class Parc {
   private String attraction;
   private String openingHours;
    private int price;



    public   Parc (String attraction,String openingHours, int price){
        this.attraction =attraction;
        this.openingHours = openingHours;
        this.price = price;
    }
    public void runs(){
        System.out.println("Атракцион - " + attraction);
        System.out.println("Время работы - " + openingHours);
        System.out.println("Цена - " + price);
    }
}
