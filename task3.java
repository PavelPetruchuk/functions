public class task3 {
    /*���� ��� ������������� ������������.
    ������ �� ��� �������� ����� �������������� ����������� a � b - ������� ������������.
    �������� ���, � ������� ����������� ������� ������� ������������ � ����� ��� ������� ������������ ���� � ������.
    ��� ����� ����������� �������� 2 �������.
    ������: �� ���� �������� �������������� ������������ ���������� ��� �������.
    ������: ���������� ���������� ������� ���� ������������� � ������� �� ������� ������ ����������� ������, ������ ��� ����� �������.
    ���������, ��� ������� ����� ���� ������������ ������*/
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

