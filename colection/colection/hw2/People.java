package oop.getcourse.dmdev.colection.colection.hw2;

/**
 * Дан список чатов с предыдущего задания, только вместо поля “количество пользователей” будет список объектов типа Пользователь,
 * // который имеет 3 поля: id (целочисленный идентификатор), имя и возраст.
 * //- Преобразовать список чатов в один список пользователей всех чатов, возраст которых больше 18 лет
 * С помощью итератора посчитать средний возраст всех оставшихся пользователей
 **/

public class People {
    private int id;
    private String name;
    private int age;

    public People(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Chat1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
