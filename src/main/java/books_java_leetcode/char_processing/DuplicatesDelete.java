package books_java_leetcode.char_processing;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicatesDelete {
    public static void main(String[] args) {
        String s = deleteDuplicatesFirst("Hello Nikolay!");
        System.out.println(s);
    }
    public static String deleteDuplicatesFirst(String line){
        char[] chars = line.toCharArray();
        StringBuilder builder = new StringBuilder();
        Set<Character> characterSet = new HashSet<>();
        for (char element:chars){
            if (characterSet.add(element)){
                builder.append(element);
            };
        }
       return builder.toString();
    }

    public static String deleteDuplicatesSecond(String line){
        return Arrays.asList(line.split("")).stream().distinct().collect(Collectors.joining());
    }
}
