package oop.getcourse.dmdev.colection.functional;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * Дан список студентов с полями:
 * - Имя
 * - Фамилия
 * - Номер курса в университете
 * - Список оценок за учебу
 * Преобразовать этот список студентов в ассоциативный массив, где ключом является номер курса, а значением:
 * Средняя оценка студентов этого курса, количество оценок у которых больше 3-х
 * Список студентов данного курса, но только с полями Имя и Фамилия.
 * Список должен быть отсортированы по этим двум полям
 * Объект с двумя полями:
 * - Отсортированный список студентов с пункта 2
 * - Средняя оценка этих студентов
 * Подумать, как ассоциативный массив можно было представить в коде в виде отсортированного - TreeMap
 */

public class StudentRunner {
    public static void main(String[] args) {
        Student student1 = new Student("Ivan", "Ivanov", 3, List.of(3, 6));
        Student student2 = new Student("Pavel", "Petrov", 1, List.of(5, 3, 6));
        Student student3 = new Student("Ignat", "Ignatov", 2, List.of(1, 7, 5, 4, 5));
        Student student4 = new Student("Ilya", "Bazanov", 4, List.of(6, 3, 5, 6, 5));
        Student student5 = new Student("Evgeny", "Mihaylov", 3, List.of(41, 8, 5));
        Student student6 = new Student("Misha", "Kotov", 2, List.of(4, 1, 9, 4, 5));
        Student student7 = new Student("Slava", "Komarovskiy", 4, List.of(4, 10, 5, 1, 5));
        List<Student> students = new ArrayList();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);
        students.add(student7);
        StudentUtil.printMapOfStudents(StudentUtil.getMapWithAverageMarkOfStudents(students));
        StudentUtil.printMapOfStudents(StudentUtil.getMapWithListOfStudents(students));
        StudentUtil.printMapOfStudents(StudentUtil.getMapWithObjectWithTwoFields(students));
    }
}
