package oop.space;

public abstract class SpaceObject implements Diameter {
    private double weight;
    private String name;
    private double radius;

    public double getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public double getRadius() {
        return radius;
    }

    public SpaceObject(double weight, String name, double radius) {
        this.weight = weight;
        this.name = name;
        this.radius = radius;

    }
    public void objectFunctionality() {
        System.out.println("ya kosmicheskiy object");
    }

    @Override
    public double getDiameter() {
        return 2 * this.radius;
    }

    public boolean isThisObjectBigger(SpaceObject spaceObject) {
        return this.getDiameter() > spaceObject.getDiameter();
    }
}
