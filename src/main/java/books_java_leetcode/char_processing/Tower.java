package books_java_leetcode.char_processing;

public class Tower {
    public static void main(String[] args) {
        String[] strings = buildTowerSecond(3);
        for (String element : strings) {
            System.out.println(element);
        }
    }

    public static String[] buildTower(int floors) {
        String[] tower = new String[floors];
        int k = floors - 1;
        for (int i = 0; i < floors; i++) {
            int spaces = floors - i - 1;
            int stars = 2 * i + 1;
            if (k == i) {
                tower[i] = "\"" + " ".repeat(floors - i - 1) + "*".repeat(i * 2 + 1) + " ".repeat(floors - i - 1) + (i == floors - 1 ? "\"":"");
            } else {
                tower[i] = "\"" + " ".repeat(floors - i - 1) + "*".repeat(i * 2 + 1) + " ".repeat(floors - i - 1) + (i == floors - 1 ? "\"" : "\",");
            }
        }
        return tower;
    }

    public static String[] buildTowerSecond(int nFloors) {
        String[] tower = new String[nFloors];
        for (int i = 0; i < nFloors; i++) {
            tower[i] = " ".repeat(nFloors - i - 1) + "*".repeat(i * 2 + 1) + " ".repeat(nFloors - i - 1);
        }
        return tower;
    }
}
