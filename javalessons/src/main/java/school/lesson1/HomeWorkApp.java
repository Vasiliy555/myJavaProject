package school.lesson1;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
    public static void printThreeWords() {
        String [] arr = new String[] {"Orange", "Banana", "Apple"};
        for ( int i = 0; i < 3; i++)

            System.out.println(arr[i]);
    }

    public static void checkSumSign() {
        int a = 52, b = -113;

        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = -15;

        if ( value <= 0) {
            System.out.println("Красный");
        }
        if ( value > 0 && value <= 100) {
            System.out.println("Желтый");
        }
        if ( value > 100) {
            System.out.println("Зеленый");
        }
    }
    public static void compareNumbers() {
        int a = 5;
        int b = 20;

        if ( a >= b) {
            System.out.println("a >= b");
        }
        else{
            System.out.println("a < b");
        }
    }
}
