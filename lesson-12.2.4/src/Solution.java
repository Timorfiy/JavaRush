/*
Робозомби космопорта
*/

public class Solution {

    public final static String[] lyrics = {"Du...", "Du hast...", "Du hast ultra metal"};

    public static void main(String[] args) {
        UltraMetal ultraMetal = new UltraMetal();
        ultraMetal.playUltraMetal(lyrics[0], lyrics[1], lyrics[2]);
    }
}