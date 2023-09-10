package books_java_leetcode.string_processing;

import java.util.Arrays;

public class Prefix {
    public static void main(String[] args) {
        String[] texts = {"abc", "abcd", "abcde", "ab", "abcd", "abcdf"};
        System.out.println("Наибольший общий префикс: " + longestCommonPrefix(texts));
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length - 1];
        int i = 0;
        while (i < first.length() && i < last.length() && first.charAt(i) == last.charAt(i)) {
            i++;
        }
        return first.substring(0, i);
    }
}
