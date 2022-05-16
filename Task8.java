package by.demdev;
//Дан одномерный массив символов.
//Преобразовать его в одномерный массив чисел, где число - это код символа (любой символ - это число в памяти компьютера).
//Например: [‘a’, ‘6’, ‘y’, ‘P’, ‘T’, ‘q’, ‘9’, ‘+’] -> [97, 54, 121, 80, 84, 113, 57, 43]
//
//Далее определить среднее арифметическое всех элементов целочисленного массива и вывести на консоль только те элементы,
// которые больше этого среднего арифметического.

import java.util.Arrays;

public class Task8 {
    public static void main(String[] args) {
        char[] array = {'a', '6', 'y', 'P', 'T', 'q', '9', '+'};
        int[] arrayOfCodes = convertToNumbers(array);
        double arithmeticMean = arithmeticMean(arrayOfCodes);
        printElementsBigger(arrayOfCodes, arithmeticMean);
    }

    public static int[] convertToNumbers(char[] array) {
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int symbolCode = array[i];
            result[i] = symbolCode;
        }

        return result; 
    }

    public static double arithmeticMean(int[] arrayOfCodes) {
        double average = 0;
        if (arrayOfCodes.length > 0) {
            double sum = 0;
            for (int j = 0; j < arrayOfCodes.length; j++) {
                sum += arrayOfCodes[j];
            }
            average = sum / arrayOfCodes.length;
        }
        return average;
    }


    public static void printElementsBigger(int[] array, double number) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] > number) {
                System.out.println(array[i]);
            }
        }
    }
}
