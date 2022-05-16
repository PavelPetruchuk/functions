package by.demdev;
//Дан одномерный массив целых чисел.
//Написать функцию, которая принимает этот массив и разбивает на 3 других: с только отрицательными числами, только положительными и только нули.
//       Если для какого-то из массивов не будет значений, то должен быть создан пустой массив.
//        Возвращает функция эти три массива в виде одного двумерного.
//       Пример:
//       [-4, -18]
//       [-4, 0, 1, 9, 0, -18, 3] -> [0, 0]
//       [1, 9, 3]

import java.util.Arrays;

public class Task9 {
    public static void main(String[] args) {
        int[] array = {-4, 0, 1, 9, 0, -18, 3};
        int[] newNullArray = nullElements(array);
        int[] newPositiveArray = positiveElements(array);
        int[] newNegativeArray = negativElements(array);
        System.out.println(Arrays.toString(newNullArray));
        System.out.println(Arrays.toString(newPositiveArray));
        System.out.println(Arrays.toString(newNegativeArray));
    }

    public static int[] nullElements(int[] array) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                counter++;
            }
        }
        int[] newArray = new int[counter];
        int ArrayPointer = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                newArray[ArrayPointer] = array[i];
                ArrayPointer++;
            }
        }
        return newArray;
    }

    public static int[] positiveElements(int[] array) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                counter++;
            }
        }
        int[] newArray = new int[counter];
        int ArrayPointer = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                newArray[ArrayPointer] = array[i];
                ArrayPointer++;
            }

        }
        return newArray;
    }

    public static int[] negativElements(int[] array) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                counter++;
            }
        }
        int[] newArray = new int[counter];
        int ArrayPointer = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                newArray[ArrayPointer] = array[i];
                ArrayPointer++;

            }
        }
        return newArray;
    }

}




