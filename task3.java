public class task3 {
    /*Даны два прямоугольных треугольника.
    Каждый из них задается двумя целочисленными переменными a и b - стороны треугольника.
    Написать код, в котором вычисляется площадь каждого треугольника и затем эти площади сравниваются друг с другом.
    Для этого понадобится написать 2 функции.
    Первая: по двум сторонам прямоугольного треугольника возвращает его площадь.
    Вторая: сравнивает переданные площади двух треугольников и выводит на консоль первый треугольник больше, меньше или равен второму.
    Учитывать, что площадь может быть вещественным числом*/
    public static void main(String[] args) {
        int a1 = 3;
        int b1 = 4;
        int a2 = 6;
        int b2 = 7;
        double sqr1 = sqrTriangle(a1, b1);
        double sqr2 = sqrTriangle(a2, b2);
        compareSqrs(sqr1, sqr2);
    }

    public static double sqrTriangle(int a1, int b1) {
        double result = (double) a1 * b1 / 2;
        return result;
    }

    public static void compareSqrs(double sqr1, double sqr2) {
        if (sqr1 > sqr2) {
            System.out.println(sqr1 + " is bigger");
        } else if (sqr1 < sqr2) {
            System.out.println(sqr1 + " is smaller");
        } else {
            System.out.println("they are equal");
        }
    }
}

