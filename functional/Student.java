package oop.getcourse.dmdev.colection.functional;

import java.util.List;

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

public class Student {

    private String name;
    private String surname;
    private int course;
    private List<Integer> marksList;

    public Student(String name, String surname, int course, List<Integer> marksList) {
        this.name = name;
        this.surname = surname;
        this.course = course;
        this.marksList = marksList;
    }

    public double getAverageMark() {
        int sum = 0;
        int sumOfMarks = marksList.stream().reduce(sum, Integer::sum);
        return sumOfMarks / (double) marksList.size();
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getCourse() {
        return course;
    }

    public List<Integer> getMarksList() {
        return marksList;
    }
}


