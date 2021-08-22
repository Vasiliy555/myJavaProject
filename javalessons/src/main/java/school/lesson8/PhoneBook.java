package school.lesson8;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private Map<Integer, String> phonebook;


    public PhoneBook() {
        phonebook = new HashMap<>();
    }

    public void addPhone(Integer number, String surName) {
        phonebook.put(number, surName);
    }
    public void getPhone(String surName){
        if (phonebook.containsValue(surName)) {
            System.out.println(surName + " - номер телефона: ");
            for (Map.Entry<Integer, String> o : phonebook.entrySet()) {
                if (o.getValue().equals(surName)) {
                    System.out.print(o.getKey() + "  ");
                }
            }
        } else {
            System.out.println(surName + " - абонент не найден." );
        }
    }
}
