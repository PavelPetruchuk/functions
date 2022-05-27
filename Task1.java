package string.dmdevm.task1;
//Дана строка.
//Удалить из нее все повторяющиеся символы без учета регистра, если они идут друг за другом. Также удалить пробелы.
//Результат привести к верхнему регистру.
//Например:
//"abc Cpddd Dio OsfWw" -> "ABCPDIOSFW"

public class Task1 {
    public static void main(String[] args) {
        StringBuilder st = new StringBuilder("abc Cpddd Dio OsfWw".replaceAll(" ", "").toUpperCase());
        for (int i = 0; i < st.length(); ) {
            if ((i > 0) && (st.charAt(i - 1)) == st.charAt(i)) {
                st.deleteCharAt(i);
            } else {
                i++;
            }
        }
        System.out.println(st);
    }
}

















