package school.lesson4;

public class Cat extends Animal{
    private static int quantityCat;
    public Cat(String name) {
              super(name);
        quantityCat++;

    }
    public static int getQuantityCat() {
        return quantityCat;
    }

    public void run(int distance) {
        if (distance <= 200 && distance >= 0) {
            System.out.printf("Кот %s пробежал " + distance, name);
            System.out.println();
        } else if (distance < 0) {
            System.out.println("Дистанция не может быть отрицательная ");
        } else {
            System.out.println("Кот не может бежать такую дистанцию " + distance);
        }
    }

    public void swim(int distance) {
        System.out.println("Кот не умеет плавать");
    }
}
