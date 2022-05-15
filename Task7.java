package by.demdev;

import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {
        int[] array = {3, 5, -6, 3, 2, -9, 0, -123};
        int[] newPositiveArray = filterNegativeElementsAndFillsAnEmptyArray(array);
        multiplyElements(newPositiveArray);
        System.out.println(Arrays.toString(newPositiveArray));
    }

    public static int[] filterNegativeElementsAndFillsAnEmptyArray(int[] array) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 0) {
                counter++;
            }
        }
        int[] newArray = new int[counter];
        int ArrayPointer = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 0) {
                newArray[ArrayPointer] = array[i];
                ArrayPointer++;
            }
        }
        return newArray;
    }

    public static void multiplyElements(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * array.length;
        }
    }
}


