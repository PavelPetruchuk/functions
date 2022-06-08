package oop.space;

public enum SateliteType {
    AstronomicalSatellites("astronomicalSatellites"),
    BioSatellites("bioSatellites");


    private final String name;

    SateliteType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
