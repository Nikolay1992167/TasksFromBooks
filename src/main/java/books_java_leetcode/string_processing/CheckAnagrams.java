package books_java_leetcode.string_processing;

import java.util.Arrays;

public class CheckAnagrams {

    public static void main(String[] args) {
        String line1 = "Hello";
        String line2 = "Gret";
        System.out.println(areAnagrams(line1, line2));
    }
    public static boolean areAnagrams(String str1, String str2) {
        char[] charArray1 = str1.toLowerCase().toCharArray();
        char[] charArray2 = str2.toLowerCase().toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        return Arrays.equals(charArray1, charArray2);
    }
}
