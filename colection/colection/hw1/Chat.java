package oop.getcourse.dmdev.colection.colection.hw1;

public class Chat {
    private final String name;
    private final int numberOfUsers;

    public Chat(String name, int numberOfUsers) {
        this.name = name;
        this.numberOfUsers = numberOfUsers;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    @Override
    public String toString() {
        return "Chat{" + "name='" + name + '\'' + ", numberOfUsers=" + numberOfUsers + '}';
    }
}
