package school.lesson2;

import java.util.Arrays;
import java.util.Scanner;

public class Lesson2 {

    public static void main(String[] args) {
        System.out.println("_____Task 1_____");
        insideOf(1, 2);

        System.out.println("_____Task 2_____");
        isPositive(1);

        System.out.println("_____Task 3_____");
        isNegative(-1);

        System.out.println("_____Task 4_____");
        countString();

        System.out.println("_____Task 5_____");
        isLeap(1997);

        System.out.println("_____Task 6_____");
        changeArray();

        System.out.println("_____Task 7_____");
        fillArray(10);

        System.out.println("_____Task 8_____");
        arrMultiplication();

        System.out.println("_____Task 9_____");
        arrDiagonal(8);

        System.out.println("_____Task 10_____");
        arrEqual(5, 888);

        System.out.println("_____Task 10.1_____");
        minMax();

        System.out.println("_____Task 10.2_____");
        arraySum();

        System.out.println("_____Task 12.3_____");
        arrShift(-2);
    }

    //              ---------- Task 1 ----------
    /*Написать метод, принимающий на вход два целых числа и проверяющий, что их
сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в
противном случае – false.*/

    public static boolean insideOf(int a, int b) {
        if (a + b >= 10 && a + b <= 20) {
            System.out.println("Число в пределах от 10 до 20.");
            return true;
        } else {
            System.out.println("Число не в пределах от 10 до 20.");
            return false;
        }
    }

//              ---------- Task 2 ----------
    /*Написать метод, которому в качестве параметра передается целое число, метод
должен напечатать в консоль, положительное ли число передали или
отрицательное. Замечание: ноль считаем положительным числом.*/

    public static void isPositive(int number) {
        if (number >= 0)
            System.out.println(number + " - положительное число.");
        else
            System.out.println(number + " - отрицательное число.");
    }
//              ---------- Task 3 ----------
    /*Написать метод, которому в качестве параметра передается целое число. Метод
должен вернуть true, если число отрицательное, и вернуть false если положительное.*/

    public static boolean isNegative(int number) {

        if (number >= 0) {
            System.out.println(number + " - положительное число.");
            return false;
        } else {
            System.out.println(number + " - отрицательное число.");
            return true;

        }
    }

    //              ---------- Task 4 ----------
    /*Написать метод, которому в качестве аргументов передается строка и число, метод
должен отпечатать в консоль указанную строку, указанное количество раз;*/

    public static void countString() {
        Scanner in = new Scanner(System.in);
        Scanner mes = new Scanner(System.in);
        System.out.println("Enter number of strings");
        int first = in.nextInt();
        System.out.println("Enter your message");
        String result = " " + mes.nextLine();
        for (int x = 1; first >= x; x++) {
            System.out.println(x + ". " + result);
        }
    }

    //              ---------- Task 5 ----------
    /* Написать метод, который определяет, является ли год високосным, и возвращает boolean
     (високосный - true, не високосный - false). Каждый 4-й год является високосным, кроме каждого 100-го,
     при этом каждый 400-й – високосный.*/
    public static boolean isLeap(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " - високосный год.");
            return true;
        } else {
            System.out.println(year + " - не високосный год.");
            return false;
        }
    }

    //              ---------- Task 6 ----------
    /*Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1,
0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;*/
    public static void changeArray() {
        int[] array = new int[]{1, 1, 1, 0, 0, 0, 1, 1, 0, 0, 1, 1};
        System.out.println(Arrays.toString(array) + " - заданный массив.");
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
        }
        System.out.println(Arrays.toString(array) + " - преобразованный массив.");
    }

    //              ---------- Task 7 ----------
/*Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его
значениями 1 2 3 4 5 6 7 8 … 100;*/
    public static void fillArray(int m1) {
        int array[] = new int[m1];
        for (int i = 0; i < array.length; i++) {
            array[i] += i;
            System.out.print(array[i]);
        }
    }

    //              ---------- Task 8 ----------
    /*Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие
6 умножить на 2;*/
    public static void arrMultiplication() {
        int[] array = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
//            do{
//                array[i] *=2;
//            } while (array[i] < 6);
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    //              ---------- Task 9 ----------
    /*Создать квадратный двумерный целочисленный массив (количество строк и
столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные
элементы единицами (можно только одну из диагоналей, если обе сложно).
Определить элементы одной из диагоналей можно по следующему принципу:
индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];*/
    public static void arrDiagonal(int x) {
        int[][] frame = new int[x][x];
        for (int i = 0; i < frame.length; i++) {
            for (int j = 0; j < frame.length; j++) {
                if (i + j == frame[i].length - 1 || i == j) {
                    frame[i][j] = 7;
                }
                System.out.print(frame[i][j]);
            }
            System.out.println();
        }
    }

    //              ---------- Task 10 ----------
    /*Написать метод, принимающий на вход два аргумента: len и initialValue, и
возвращающий одномерный массив типа int длиной len, каждая ячейка которого
равна initialValue;*/
    public static void arrEqual(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = initialValue;
        }
        System.out.println(Arrays.toString(array));
    }

    //              ---------- Task 10.1 ----------
    /*Задать одномерный массив и найти в нем минимальный и максимальный элементы; */
    public static void minMax() {
        int[] array = new int[]{-18, -17892, 178, 514, 4, -197, 20154, -874, 1245};
        int min, max;
        min = max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            } else if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.printf("Минимальное значение:=%d \nМаксимальное значение:=%d ", min, max);
        System.out.println();
    }

    //              ---------- Task 10.2 ----------
    /*Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен
вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.*/
    public static boolean arraySum() {

        int leftSum = 0, rightSum = 0;
        int[] array = new int[]{1, 1, 1, 174, 1, 47, 1, 1};
        for (int j = 0; j < array.length; j++) {

            rightSum += array[j];
        }
        for (int i = 0; i < array.length; i++) {
            leftSum += array[i];
            rightSum -= array[i];
            if (leftSum == rightSum) {
                System.out.println("Сумма левой и правой части массива равны");
                return true;
            }
        }
        System.out.println("Сумма левой и правой части массива не равны");
        System.out.println();
        return false;
    }
    //              ---------- Task 10.2 ----------
    /*Написать метод, которому на вход подается одномерный массив и число n (может
быть положительным, или отрицательным), при этом метод должен сместить все
элементы массива на n позиций. Элементы смещаются циклично. Для усложнения
задачи нельзя пользоваться вспомогательными массивами. Примеры: [ 1, 2, 3 ] при n = 1
(на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ]. При каком n в
какую сторону сдвиг можете выбирать сами.*/

    static void arrShift(int n) {
        int[] array = new int[]{18, 275, -1786, 897, -14, 9874};
        System.out.println(Arrays.toString(array));
        int actual = 0;
        if (n < 0) {
            for (int i = 1; i <= Math.abs(n); i++) {
                for (int j = 0; j < array.length - 1; j++) {
                    actual = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = actual;
                }
            }
        } else {
            for (int i = 1; i <= n; i++) {
                for (int j = array.length - 1; j > 0; j--) {
                    actual = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = actual;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}