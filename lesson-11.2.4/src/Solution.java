/*
Голограммный проектор
*/

public class Solution {

    public static HologramProjector projector;

    public static void main(String[] args) {
        String[] spareParts = new String[]{
                "пустые бутылки из-под электролитов",
                "лампа с отражателем",
                "металлические опилки",
                "цветосмесительный призматический блок",
                "глушитель",
                "сломанная винтовка \"Тесла\"",
                "конденсор",
                "полупроницаемые зеркала-фильтры",
                "магниевые свечи",
                "объектив",
                "старый световой меч",
                "полисиликоновая матрица",
                "треснувшая нагрудная пластина"
        };

        //напишите тут ваш код

        projector = new HologramProjector(spareParts[10], spareParts[12], spareParts[7], spareParts[2], spareParts[4], spareParts[8]);
    }
}