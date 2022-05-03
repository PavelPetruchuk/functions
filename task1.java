public class task1 {
    /*
    В переменной minutes лежит число от 0 до 59.
    Написать функцию, которая принимает в качестве параметра значение переменной minutes и выводит на консоль
    в какую четверть часа попадает это число (в первую, вторую, третью или четвертую).
    */
    public static void main(String[] args) {
        int minutes = 14;
        getPart(minutes);
    }

    public static void getPart(int minutes) {
        if (minutes >= 0 && minutes <= 15)
            System.out.println("в первую четверть");
        else if (minutes >= 16 && minutes <= 30) {
            System.out.println("во вторую четверть");
        } else if (minutes >= 31 && minutes <= 45) {
            System.out.println("в третью четверть");
        } else if (minutes >= 46 && minutes <= 59) {
            System.out.println("в четвертую четверть");
        } else {
            System.out.println("значение не соответсует задаче");
        }
    }
}

