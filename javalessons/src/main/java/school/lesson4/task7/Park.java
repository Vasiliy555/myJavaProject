package school.lesson4.task7;

public class Park {
    private String workingHours = "Работает: с 9 до 20 ежедневно";
    private String name;
    private int cost = 2;


    class Attraction {

        public void infoTrain() {
            name = "Поезд";
            System.out.printf("Аттракцион - %s. %s . Стоимость: %d",name, workingHours,cost);
            System.out.println();
        }
        public void infoWheel() {
           name = "Колесо";
            System.out.printf("Аттракцион - %s. %s . Стоимость: %d", name, workingHours,cost);
            System.out.println();
        }
        public void infoVeterok() {
            name = "Ветерок";
            System.out.printf("Аттракцион - %s. %s . Стоимость: %d",name, workingHours,cost);
            System.out.println();
        }
    }




    public static void main(String[] args) {
        Park.Attraction info = new Park().new Attraction();


info.infoTrain();
info.infoWheel();
info.infoVeterok();

    }
}
