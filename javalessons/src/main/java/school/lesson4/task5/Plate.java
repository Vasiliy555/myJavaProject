package school.lesson4.task5;

public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }
    public void info() {
        System.out.println("в тарелке: " + food);
    }

    //    Сделать так, чтобы в тарелке с едой не могло получиться отрицательного
//количества еды (например, в миске 10 еды, а кот пытается покушать 15-20).
    public boolean decreaseFood(int n) {
        if (food >= n) {
            food -= n;
            return true;
        } else {
            System.out.println(" Не достаточно еды. Кот голоден");
            return false;
        }
    }

    //    Добавить в тарелку метод, с помощью которого можно было бы добавлять
//еду в тарелку.
    public void addFood(int n) {
        if (n>0) {
            food += n;
            System.out.printf("Кол-во %s еды было добавлено, в тарелке %s : еды ", n ,getFood());
            System.out.println();
        } else {
            System.out.println(" Не правильное кол-во добавляемое еды");
        }
    }
    public int getFood() {
        return food;
    }
}
