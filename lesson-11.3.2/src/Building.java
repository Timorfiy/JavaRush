/*
Многосерийный предприниматель
*/

public class Building {
    private String type;

    //напишите тут ваш код

    public void initialize(String type) {
        this.type = type;
    }

    public static void main(String[] args) {
        Building building = new Building();
        building.initialize("Барбершоп");
    }
}