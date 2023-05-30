import java.util.ArrayList;
import java.util.Arrays;

/*
Аккаунт ИнстаМатрицы
*/

public class Solution {

    public static ArrayList<String> accountsList = new ArrayList<>();

    public static void main(String[] args) {
        //напишите тут ваш код
        convertAccounts();
        registerAccount("Амиго");
        registerAccount("Диего");
        for (String s : accountsList) {
            System.out.println(s);
        }
    }

    public static void convertAccounts() {
        //напишите тут ваш код
        accountsList.addAll(Arrays.asList(Accounts.getAccounts()));
    }

    public static void registerAccount(String username) {
        //напишите тут ваш код
        if (!accountsList.contains(username)) {
            accountsList.add(username);
        }
    }
}