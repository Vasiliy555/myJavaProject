package school.lesson4;

public class AnimalApp {
    public static void main(String[] args) {
        Animal animal = new Animal("Friendly");
        Cat cat1 = new Cat("Барсик");
        Dog dog1 = new Dog("Шарик", "белый");
        Cat cat2 = new Cat("Мурзик");
        Dog dog2 = new Dog("Мухтар", "черный");
        animal.run();
        cat1.run(200);
        cat1.swim(15);
        cat2.run(350);
        dog1.run(-10);
        dog1.swim(10);
        dog2.run(600);
        dog2.swim(11);

//4. * Добавить подсчет созданных котов, собак и животных.
        System.out.printf("Количество созданных животных  - %s . \n", Animal.getQuantityAnimals());
        System.out.printf("Количество созданных котов  - %s . \n", Cat.getQuantityAnimals());
        System.out.printf("Количество созданных собак  - %s . \n", Dog.getQuantityAnimals());
    }
}
