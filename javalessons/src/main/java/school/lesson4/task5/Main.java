package school.lesson4.task5;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Барсик", 10);
        Plate plate = new Plate(100);
        plate.info();
        plate.addFood(5);
        plate.info();

//        Создать массив котов и тарелку с едой, попросить всех котов покушать из
//этой тарелки и потом вывести информацию о сытости котов в консоль.

        Cat[] catArray = new Cat[5];
        catArray[0] = new Cat("Мурка", 10);
        catArray[1] = new Cat("Мурзик", 100);
        catArray[2] = new Cat("Васька", 30);
        catArray[3] = new Cat("Лапка", 45);
        catArray[4] = new Cat("Мышка", 5);


        for (int i = 0; i < catArray.length; i++) {
            catArray[i].eat(plate);
            plate.info();
        }
    }
}
