/*
Прогноз погоды
*/

public class Solution {

    public static void showWeather(City city) {
        //напишите тут ваш код
        System.out.printf("В городе %s сегодня температура воздуха %d", city.getName(), city.getTemperature());
    }

    public static void main(String[] args) {
        //напишите тут ваш код
        City city = new City("Пермь", 27);
        showWeather(city);
    }
}