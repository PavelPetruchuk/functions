package oop.getcourse.dmdev.colection.functional;

public class StudentModel {
    private String name;
    private String surname;

    public StudentModel(Student student) {
        this.name = student.getName();
        this.surname = student.getSurname();
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return "StudentModel{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
