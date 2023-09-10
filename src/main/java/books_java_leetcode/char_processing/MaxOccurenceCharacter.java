package books_java_leetcode.char_processing;

import org.javatuples.Pair;

import javax.swing.*;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MaxOccurenceCharacter {
    public static void main(String[] args) {
        findMaxChar("Hello world!");
    }

    public static void findMaxChar(String str) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        char maxChar = ' ';
        int maxCount = 0;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxChar = entry.getKey();
                maxCount = entry.getValue();
            }
        }
        System.out.println("Символ с наибольшим числом появлений: " + maxChar);
        System.out.println("Количество повторений: " + maxCount);
    }
}
