package ru.getcourse.dmdev.cycles;

/*Дано целое число.
Написать функцию, которая принимает целое число, а возвращает целое число обратное этому (не строку!).
Результат вывести на консоль.
Например: 4508 -> 8054, 4700 -> 74, 1234567 -> 7654321
Примечание: для решения может понадобится функция возведение числа в степень: Math.pow(число, степень)
 */
public class Lesson4Cycles {
    public static void main(String[] args) {
        int value = 4700;
        int result = reverseValue(value);
        System.out.println(result);
    }
    public static int reverseValue(int value) {
        int result = 0;
        while (value != 0) {
            int remainder = value % 10;
            result = result * 10 + remainder;
            value = value / 10;
        }
        return result;
    }
}
