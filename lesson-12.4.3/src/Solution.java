/*
Объекты внутренних и вложенных классов
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        Outer.Nested nested = new Outer.Nested();
    }
}
