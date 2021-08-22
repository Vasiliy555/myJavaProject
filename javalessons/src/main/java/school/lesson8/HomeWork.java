package school.lesson8;

import java.util.*;

public class HomeWork {
    public static void main(String[] args) {
     /*   1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
                Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не
                считаем). Посчитать, сколько раз встречается каждое слово.*/
        String[] words = new String[]{"нос", "рот", "мышь", "стол", "небо", "рот",
                "нос", "радуга", "нос", "мышь", "нос", "нос", "небо"};

        Set<String> uniqueWords = new TreeSet<>();
        Map<String, Integer> countWords = new TreeMap<>();

        uniqueWords.addAll(List.of(words));
        System.out.println("Список уникальных слов: " + uniqueWords);

        for(String x : words){
            if(!countWords.containsKey(x)){
                countWords.put(x,1);
            }else {
                int count = countWords.get(x);
                countWords.put(x,count + 1);
            }
        }
        System.out.println("Количество повторений слов: " + countWords);

   /*     2. Написать простой класс Телефонный Справочник, который хранит в себе список
        фамилий и телефонных номеров. В этот телефонный справочник с помощью метода
        add() можно добавлять записи, а с помощью метода get() искать номер телефона по
        фамилии. Следует учесть, что под одной фамилией может быть несколько
        телефонов (в случае однофамильцев), тогда при запросе такой фамилии должны
        выводиться все телефоны.*/
        PhoneBook myBook = new PhoneBook();
        myBook.addPhone(291111111,"Andreev");
        myBook.addPhone(292222222,"Andreev");
        myBook.addPhone(293333333,"Andreev");
        myBook.addPhone(294444444,"Andreev");
        myBook.addPhone(295555555,"Vasilev");
        myBook.addPhone(296666666,"Vasilev");
        myBook.addPhone(297777777,"Sergeev");

        myBook.getPhone("Vasile");



    }
}
