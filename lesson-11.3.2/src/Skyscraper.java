/*
Построим новый жилой комплекс JavaRush Towers
*/

public class Skyscraper {
    public static final String SKYSCRAPER_WAS_BUILD = "Небоскреб построен.";
    public static final String SKYSCRAPER_WAS_BUILD_FLOORS_COUNT = "Небоскреб построен. Количество этажей - ";
    public static final String SKYSCRAPER_WAS_BUILD_DEVELOPER = "Небоскреб построен. Застройщик - ";

    //напишите тут ваш код
    public Skyscraper() {
        System.out.println("Небоскреб построен.");
    }

    public Skyscraper(int floors) {
        System.out.println("Небоскреб построен. Количество этажей - " + floors);
    }

    public Skyscraper(String name) {
        System.out.println("Небоскреб построен. Застройщик - " + name);
    }

    public static void main(String[] args) {
        Skyscraper skyscraper = new Skyscraper();
        Skyscraper skyscraperTower = new Skyscraper(50);
        Skyscraper skyscraperSkyline = new Skyscraper("JavaRushDevelopment");
    }
}