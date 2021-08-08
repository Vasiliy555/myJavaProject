package school.lesson4.task7;

public class Park {
    class Train {
        private String workingHours = "Работает: с 9 до 20 ежедневно";
        private String name = "Поезд";
        private int cost = 2;
        public void info() {
            System.out.printf("Аттракцион - %s %s. Стоимость: %d", name, workingHours,cost);
            System.out.println();
        }
        public void cost() {
            System.out.printf("Аттракцион - %s. Стоимость: %d", name, cost);
            System.out.println();
        }
        public void open() {
            System.out.printf("Аттракцион - %s. %s", name, workingHours);
            System.out.println();
        }
        public void name() {
            System.out.printf("Аттракцион - %s", name);
            System.out.println();
        }
    }
    void infoTrain () {
        Train chu= new Train();
        System.out.printf("Аттракцион - %s. %s. Стоимость: %d", chu.name, chu.workingHours,chu.cost);
        System.out.println();
    }




    public static void main(String[] args) {
        Park.Train train = new Park().new Train();
        train.name();
        train.cost();
        train.open();

        Park park1 = new Park();
        park1.infoTrain();
    }
}
