package oop.space;

public class SpaceRuner {
    public static void main(String[] args) {
        Asteroid asteroid = new Asteroid(200,"Asteroid",34343,AsteroidType.Carbon);
        Star star = new Star(2332,"zvezda",2323,StarType.Ia);
        Planet planet= new Planet(2323,"planeta",32323,SizePlanet.Gigant);
        Satellite satellite = new Satellite(32323,"sputnik",2332423,SateliteType.AstronomicalSatellites);
        asteroid.printInfo();
        planet.printInfo();
        star.printInfo();
        satellite.printInfo();
        System.out.println( SpaceUtil.isStar(star));

    }
}
