package oop.getcourse.dmdev.colection.space;

public enum StarType {
    Ia("Очень светящийся сверхгигант"),
    Ib("Сверхгигант меньшей светимости"),
    II("Светящийся гигант");

    private final String name;

    StarType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
