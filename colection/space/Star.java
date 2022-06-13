package oop.getcourse.dmdev.colection.space;

public class Star extends SpaceObject implements PrintInfo {
    private StarType starType;

    public Star(double weight, String name, double diameter,StarType starType) {
        super(weight, name, diameter);
        this.starType=starType;
    }

    public StarType getStarType() {
        return starType;
    }


    public void printInfo() {
        System.out.println(this);
        this.objectFunctionality();
    }

    @Override
    public void objectFunctionality() {
        System.out.println("yarko svechu");
    }

    @Override
    public String toString() {
        return String.format("Space object class is %s, name is %s, weight is %s, radius is %s, asteroid type is %s%n",
                this.getClass().getName(), getName(), getWeight(), getRadius(), getStarType());
    }
}

