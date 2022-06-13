package oop.getcourse.dmdev.colection.space;

public final class SpaceUtil {

    private SpaceUtil() {
    }

    public static double getPower(SpaceObject o1, SpaceObject o2) {
        return o1.getWeight() + o2.getWeight() * 5;
    }

    public static boolean isStar(SpaceObject spaceObject) {
        return spaceObject instanceof Star;
    }
}
