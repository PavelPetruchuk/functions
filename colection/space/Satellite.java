package oop.getcourse.dmdev.colection.space;

public class Satellite extends SpaceObject  {
    SateliteType seteliteType;


    public Satellite(double weight, String name, double diameter, SateliteType seteliteType) {
        super(weight, name, diameter);
        this.seteliteType=seteliteType;
    }

    public SateliteType getSeteliteType() {
        return seteliteType;
    }


    public void printInfo() {
        System.out.println(this);
        this.objectFunctionality();
    }

    @Override
    public void objectFunctionality() {
        System.out.println("isledyy komsmos");
    }

    @Override
    public String toString() {
        return String.format("Space object class is %s, name is %s, weight is %s, radius is %s, asteroid type is %s%n",
                this.getClass().getName(), getName(), getWeight(), getRadius(), getSeteliteType());
    }
}


