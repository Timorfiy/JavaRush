/*
Построим новый бизнес-комплекс JavaRush Business Center
*/

public class Skyscraper {
    private int floorsCount;
    private String developer;

    //напишите тут ваш код

    public Skyscraper() {
        floorsCount = 5;
        developer = "JavaRushDevelopment";
    }

    public Skyscraper(int floors, String name) {
        floorsCount = floors;
        developer = name;
    }

    public static void main(String[] args) {
        Skyscraper skyscraper = new Skyscraper();
        Skyscraper skyscraperUnknown = new Skyscraper(50, "Неизвестно");
    }
}
