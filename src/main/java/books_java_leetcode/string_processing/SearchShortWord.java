package books_java_leetcode.string_processing;

public class SearchShortWord {
    public static int findShort(String line) {
        String[] words = line.split(" ");
        int minLength = Integer.MAX_VALUE;
        for (String word : words) {
            if (word.length() < minLength) {
                minLength = word.length();
            }
        }
        return minLength;
    }

    public static void main(String[] args) {
        System.out.println(findShort("Hello my best friend!"));
    }
}
