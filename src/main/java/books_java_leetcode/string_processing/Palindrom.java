package books_java_leetcode.string_processing;

import java.util.stream.IntStream;

public class Palindrom {
    public static boolean isPalindromeFirst(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (right > left) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static boolean isPalindromeSecond(String str) {
        return IntStream.range(0, str.length() / 2)
                .noneMatch(p -> str.charAt(p) != str.charAt(str.length() - p - 1));
    }

    public static boolean isPalindromeThird(String str) {
        return str.contentEquals(new StringBuilder(str).reverse());
    }

    public static void main(String[] args) {
        System.out.println(isPalindromeFirst("zaraz"));
    }
}
