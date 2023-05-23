/*
Конвертер строки
*/

public class Solution {
    public static void main(String[] args) {
        String string = "12.84";
        //напишите тут ваш код
        double x = Double.parseDouble(string);
        int b = (int) Math.round(x);
        System.out.println(b);
    }
}
