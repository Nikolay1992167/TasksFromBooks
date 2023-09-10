package books_java_leetcode.char_processing;

import java.util.HashSet;

public class CheckOccurrenceCharactersInString {
    public static int numJewelsInStonesFirst(String J, String S) {
        HashSet<Character> jewels = new HashSet<>();
        for (char c : J.toCharArray()) {
            jewels.add(c);
        }
        int count = 0;
        for (char c : S.toCharArray()) {
            if (jewels.contains(c)) {
                count++;
            }
        }
        return count;
    }
    public static int numJewelsInStonesSecond(String J, String S) {
        return (int) S.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> J.indexOf(c) != -1)
                .count();
    }

    public static void main(String[] args) {
        int count = numJewelsInStonesSecond("wertyui", "wert");
        System.out.println(count);
    }
}
