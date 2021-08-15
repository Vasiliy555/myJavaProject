package school.lesson6;


class MyArraySizeException extends RuntimeException {

}

class MyArrayDataException extends RuntimeException {
    public int a;
    public int b;

    public MyArrayDataException(int a, int b) {
        this.a = a;
        this.b = b;
    }
}

public class HomeWork {
    private static int result = 0;

    public static void main(String[] args) {

        String[][] array = new String[][]{
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "hi"}};


        try {
            try {
                System.out.println(arrayCheck(array));
            } catch (MyArraySizeException e) {
                System.out.println("Не подходящий размер массива");
            }
        } catch (MyArrayDataException e) {System.out.println("Не удалось преобразовать String в Integer. " +
                "Ошибка в ячейке "+ (e.a) + " - " + (e.b));}



    }





    public static int arrayCheck(String[][] array) throws MyArraySizeException, MyArrayDataException {

        for (int i = 0; i < array.length; i++) {
            if (array.length != 4 | array[i].length != 4) throw new MyArraySizeException();

            for (int j = 0; j < array.length; j++) {
                try {
                    result += Integer.parseInt(array[i][j]);
                } catch (Exception e) {throw new MyArrayDataException(i, j);
                }
            }
        }
        return result;
    }

}
