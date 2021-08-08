package school.lesson4;

public class Cat extends Animal{
    public Cat(String name) {
        super(name);

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
