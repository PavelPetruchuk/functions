package oop.getcourse.dmdev.colection.space;

public class   Planet extends SpaceObject implements PrintInfo {
    private SizePlanet sizePlanet;


    public SizePlanet getSizePlanet() {
        return sizePlanet;
    }

    public Planet(double weight, String name, double diameter, SizePlanet sizePlanet) {
        super(weight, name, diameter);
        this.sizePlanet = sizePlanet;


    }


    public void printInfo() {
        System.out.println(this);
        this.objectFunctionality();
    }

    @Override
    public void objectFunctionality() {
        System.out.println("vrachays vokrug solnca");
    }

    @Override
    public String toString() {
        return String.format("Space object class is %s, name is %s, weight is %s, radius is %s, asteroid type is %s%n",
                this.getClass().getName(), getName(), getWeight(), getRadius(), getSizePlanet());
    }
}
