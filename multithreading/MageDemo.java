package multithreading;

/**
 * Существует две постоянно соревнующиеся расы: маги огня и маги воздуха.
 * Их задача - как можно быстрее набрать 500 красных и 500 белых кристаллов.
 * Кристаллы растут на другой планете с рандомной скоростью от 2 до 5 рандомных кристаллов в сутки
 * (может быть 1 красный и 2 белых, а может и вовсе все 4 кристалла красного цвета).
 * Маги огня и маги воздуха отправляют раз в сутки по ракете за добычей кристаллов.
 * Каждая ракета может погрузить на борт от 2 до 5 рандомных кристаллов.
 * Если кристаллов нет - ракета улетает пустой.
 * Написать программу, которая симулирует процесс заполнения кристаллов у магов огня и воздуха.
 * Для симуляции принять, что и кристаллы создаются, и ракеты прилетают в одно и то же время - полночь.
 * Соревнование заканчивается, когда какая-то раса соберет необходимые кристаллы.
 */

public class MageDemo {
    public static void main(String[] args) throws InterruptedException {
        Night night = new Night();
        Crystal crystal = new Crystal(night);
        Rocket fireRocket = new Rocket(new Mage("FireMage"), crystal.getPlanet(), night);
        Rocket airRocket = new Rocket(new Mage("AirMage"), crystal.getPlanet(), night);
        ThreadUtil.startThreads(night, crystal, fireRocket, airRocket);
        ThreadUtil.joinThreads(night, crystal, fireRocket, airRocket);
        viewStatistic(fireRocket.getMage(), airRocket.getMage());
    }

    private static void viewStatistic(Mage fireMage, Mage airMage) {
        System.out.println("----------------");
        System.out.println(fireMage.getName() + " " + "have red crystals: " + fireMage.getRedCrystals() + ", white crystals: " + fireMage.getWhiteCrystals());
        System.out.println(airMage.getName() + " " + "have red crystals: " + airMage.getRedCrystals() + ", white crystals: " + airMage.getWhiteCrystals());
    }
}
