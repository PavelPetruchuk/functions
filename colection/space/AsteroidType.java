package oop.getcourse.dmdev.colection.space;

public enum AsteroidType {

    Carbon("Carbon"),
    Silicon("Silicon"),
    Metal("Metal");

    private final String name;

    AsteroidType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
