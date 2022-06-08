package oop.space;

public class Asteroid extends SpaceObject implements PrintInfo {
    private AsteroidType asteroidType;

    public Asteroid(double weight, String name, double radius, AsteroidType asteroidType) {
        super(weight, name, radius);
        this.asteroidType = asteroidType;
    }

    public AsteroidType getAsteroidType() {
        return asteroidType;
    }


    public void printInfo() {
        System.out.println(this);
        this.objectFunctionality();
    }

    @Override
    public void objectFunctionality() {
        System.out.println("Lechy na planety zemlya");
    }

    @Override
    public String toString() {
        return String.format("Space object class is %s, name is %s, weight is %s, radius is %s, asteroid type is %s%n",
                this.getClass().getName(), getName(), getWeight(), getRadius(), getAsteroidType());
    }

}









