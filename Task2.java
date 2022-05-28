package String;
//Дана строка с текстом, в котором есть цифры от 0 до 9.
//Написать 2 метода:
//- возвращающий массив цифр из переданной строки
//- возвращающий сумму цифр из переданного целочисленного массива
//Посчитать сумму всех чисел из строки
//Например:
//“Привет 8, как 1 2 твои дела? Может4, сделать 3 дело?” -> 18 (8+1+2+4+3)

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        String value = "Привет 8, как 1 2 твои дела? Может4, сделать 3 дело?";
        int[] result = arrayOfDigits(value);
        int result1 = sum(result);
        Arrays.toString(result);
        System.out.printf(Arrays.toString(result));
    }

    private static int[] arrayOfDigits(String value) {
        int counter = 0;
        for (int i = 0; i < value.length(); i++) {
            char result = value.charAt(i);
            if (isDigit(result)) {
                counter++;
            }
        }
        int[] numbers = new int[counter];
        int j = 0;
        for (int i = 0; i < value.length(); i++) {
            char result = value.charAt(i);
            if (isDigit(result)) {
                numbers[j] = converter(result);
                j++;
            }
        }
        return numbers;
    }

    private static boolean isDigit(char result) {
        return result == '0' || result == '1' || result == '2' || result == '3' || result == '4' || result == '5' ||
                result == '6' || result == '7' || result == '8' || result == '9';
    }

    private static int converter(char s) {
        return switch (s) {
            case '0' -> 0;
            case '1' -> 1;
            case '2' -> 2;
            case '3' -> 3;
            case '4' -> 4;
            case '5' -> 5;
            case '6' -> 6;
            case '7' -> 7;
            case '8' -> 8;
            case '9' -> 9;
            default -> 100;
        };
    }

    public static int sum(int[] result) {
        int sum = 0;
        for (int i = 0; i < result.length; i++) {
            sum = sum + result[i];
        }
        System.out.println(sum);
        return sum;
    }
}