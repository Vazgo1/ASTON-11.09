package Lwsson_5.exercise_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneDirectory {
    private Map<String, List<String>> directory;

    public PhoneDirectory() {
        directory = new HashMap<>();
    }


    public void add(String surname, String phoneNumber) {
        if (!directory.containsKey(surname)) {
            directory.put(surname, new ArrayList<>());
        }
        directory.get(surname).add(phoneNumber);

    }


    public List<String> get(String surname) {
        return directory.getOrDefault(surname, new ArrayList<>());
    }


    public static void main(String[] args) {
        PhoneDirectory pd = new PhoneDirectory();

        pd.add("Грибанов", "123-456");
        pd.add("Самощенко", "234-567");
        pd.add("Грибанов", "789-012");

        System.out.println("Грибанов: " + pd.get("Грибанов"));
        System.out.println("Самощенко: " + pd.get("Самощенко"));
        System.out.println("Дьяков: " + pd.get("Дьяков"));
    }
}

