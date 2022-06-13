package oop.getcourse.dmdev.colection.colection.hw2;

import java.util.ArrayList;

public class Chat {
    private  final String name;
    private final ArrayList<People> people;

    public Chat(String name, ArrayList<People> people) {
        this.name = name;
        this.people = people;
    }

    public String getName() {
        return name;
    }

    public ArrayList<People> getPeople() {
        return people;
    }

    @Override
    public String toString() {
        return "Chat{" +
                "name='" + name + '\'' +
                ", people=" + people +
                '}';
    }
}

