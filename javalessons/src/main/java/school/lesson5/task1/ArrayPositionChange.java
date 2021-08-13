package school.lesson5.task1;

public class ArrayPositionChange<X> {
    private X[] element;

    public ArrayPositionChange(X... element) {
        this.element = element;
    }

    public void changePosition(int a, int b) {

        if (a > element.length || b > element.length) {
            System.err.println("Такой позиции в данном массиве нет");
        } else {
            System.out.println("Меняем местами заданные позиции: " + a + " - " + b);
            X temp = element[a - 1];
            element[a - 1] = element[b - 1];
            element[b - 1] = temp;
        }
    }

    public void arrayInfo() {

        for(X o: element){
            System.out.print(o+ " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayPositionChange<Integer> arrayInt =
                new ArrayPositionChange<Integer>(1, 2, 3, 4, 5, 6, 7);
        arrayInt.changePosition(10, 2);
        arrayInt.arrayInfo();

        ArrayPositionChange<String> arrayStr =
                new ArrayPositionChange<String>("123","asd","sds","467","qweq");
        arrayStr.changePosition(2,4);
        arrayStr.arrayInfo();
    }
}
