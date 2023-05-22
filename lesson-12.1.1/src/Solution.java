/*
Био-Нано-Боты
*/

public class Solution {

    public static Human sysadmin = new Human();

    public static void main(String[] args) {
        //напишите тут ваш код
        Class[] classArray = new Class[] {
                AlternativeMetal.class,
                BlackMetal.class,
                DeathMetal.class,
                DoomMetal.class,
                FolkMetal.class,
                GlamMetal.class,
                GothicMetal.class,
                HeavyMetal.class,
                IndustrialMetal.class,
                Metalcore.class,
                Music.class,
                PowerMetal.class,
                ProgressiveMetal.class,
                SpeedMetal.class,
                SymphonicMetal.class,
                ThrashMetal.class,
        };
        sysadmin.load(classArray);
    }
}