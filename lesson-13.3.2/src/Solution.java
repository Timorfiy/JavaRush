import java.util.ArrayList;

/*
Переворачивание данных
*/

public class Solution {
    public static ArrayList <Integer> numbers = new ArrayList<Integer>() ;

    public static void main(String[] args) {
        init();
        print();

        reverse();
        print();
    }

    public static void init() {
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }
    }

    public static void reverse() {
        int n = numbers.size() - 1;
        for (int i = 0; i < numbers.size() / 2; i++) {
            int temp = numbers.get(i);
            numbers.set(i, numbers.get(n - i));
            numbers.set(n - i, temp);
        }
    }
//    int n = numbers.length - 1;
//    for (int i = 0; i < numbers.length / 2; i++) {
//        int temp = numbers[i];
//        numbers[i] = numbers[n - i];
//        numbers[n - i] = temp;
//    }

    private static void print() {
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}