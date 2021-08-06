package school.lesson3;

public class MainApp {
    public static void main(String[] args) {

//            4. Создать массив из 5 сотрудников.

        Employee[] persArray = new Employee[5];
        persArray[0] = new Employee("Иванов Иван Иванович", "Директор", "corpmail@mail.ru", "+375 (33) 111-11-11", 5500, 55);
        persArray[1] = new Employee("Иванов Андрей Иванович", "Зам. директор", "corpmail@mail.ru", "+375 (33) 222-22-22", 4500, 33);
        persArray[2] = new Employee("Петров Петр Петрович", "Главный инженер", "corpmail@mail.ru", "+375 (33) 333-33-33", 4000, 50);
        persArray[3] = new Employee("Петрова Зоя Петровна", "менеджер", "corpmail@mail.ru", "+375 (33) 444-44-44", 2500, 22);
        persArray[4] = new Employee("Иванова Анна Петровна", "менеджер", "corpmail@mail.ru", "+375 (33) 555-55-55", 2500, 28);

//            5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.

//        for (int i = 0; i < persArray.length; i++) {
//            if (persArray[i].getAge() > 40) {
//                persArray[i].getInfo();
//            }
//        }
        for (Employee o : persArray) {
            if (o.getAge() > 40)
                o.getInfo();
        }

    }
}