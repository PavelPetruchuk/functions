public class task2 {
    /*Даны 3 переменные:
     operand1 (double)
     operand2 (double)
     operation (char ‘+’, ‘-’, ‘*’, ‘/’, ‘%’)
     Написать функцию, которая принимает в качестве параметров эти три переменные и возвращает результат операции.
     Протестировать функцию в main.*/
    public static void main(String[] args) {
        double operand1 = 35.6;
        double operand2 = 25.4;
        char operation = '/';
        double result = operandOperations(operand1, operand2, operation);
        System.out.println(result);

    }

    public static double operandOperations(double operand1, double operand2, char operation) {
        if (operation == '+') {
            return operand1 + operand2;
        } else if (operation == '-') {
            return operand1 - operand2;
        } else if (operation == '*') {
            return operand1 * operand2;
        } else if (operation == '/') {
            return operand1 / operand2;
        } else if (operation == '%') {
            return operand1 % operand2;
        } else {
            return 0;
        }
    }
}


