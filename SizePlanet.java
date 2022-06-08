package oop.space;

public enum SizePlanet {
    Small("Small"),
    Average("Average"),
    Gigant("Giant");

    private final String name;
    SizePlanet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


}
