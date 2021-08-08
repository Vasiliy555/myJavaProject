package school.lesson4;

public class Dog extends Animal {
    String color;

    public Dog(String name, String color) {
        super(name);
        this.color = color;
    }


    public void run(int distance) {
        if (distance <= 500 && distance >= 0) {
            System.out.printf("Собака %s пробежала " + distance, name);
            System.out.println();
        } else if (distance < 0) {
            System.out.println("Дистанция не может быть отрицательная ");
        } else {
            System.out.println("Собака не может бежать на такую дистанцию " + distance);
        }
    }

    public void swim(int distance) {
        if (distance <= 10 && distance >= 0) {
            System.out.printf("Собака  %s проплыла " + distance, name);
            System.out.println();
        } else if (distance < 0) {
            System.out.println("Дистанция не может быть отрицательная ");
        } else {
            System.out.println("Собака не может плыть на такую дистанцию " + distance);
        }

    }
}
