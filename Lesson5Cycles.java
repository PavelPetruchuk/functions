package ru.getcourse.dmdev.cycles;
/*Посчитать четные и нечетные цифры целого числа и вывести их на консоль.
Для решения написать 2 функции, которые будут принимать введенное целое число,
а возвращать количество четных цифр (вторая функция - нечетных)*/
public class Lesson5Cycles {
    public static void main(String[] args) {
        int value = 44456789;
        System.out.println("even numbers " + evenValue(value));
        System.out.println("odd numbers " + oddValue(value));
    }
    public static int evenValue(int value) {
        int counter = 0;
        while (value > 0) {
            int result = value % 10;
            value = value / 10;
            if (result % 2 == 0) {
                counter++;
            }
        }
        return counter;
    }
    public static int oddValue(int value) {
        int counter = 0;
        while (value > 0) {
            int result = value % 10;
            value = value / 10;
            if (result % 2 != 0) {
                counter++;
            }
        }
        return counter;
    }
}